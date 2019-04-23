package org.azhon.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.utils
 * 文件名:    GpsLocationUtil
 * 创建时间:  2019/3/29 on 下午3:38
 * 描述:     TODO GPS坐标系转换
 *
 * @author ZJB
 */

public class GpsLocationUtil {
    public static final String BAIDU_LBS_TYPE = "bd09ll";

    public static double pi = 3.1415926535897932384626;
    public static double a = 6378245.0;
    public static double ee = 0.00669342162296594323;


    /**
     * 84 to 火星坐标系 (GCJ-02) World Geodetic System ==> Mars Geodetic System
     *
     * @param lat
     * @param lon
     * @return
     */
    public static List<Double> gps84_To_Gcj02( double lon,double lat) {
        if (outOfChina(lat,lon )) {
            return null;
        }
        double dLat = transformLat(lon - 105.0, lat - 35.0);
        double dLon = transformLon(lon - 105.0, lat - 35.0);
        double radLat = lat / 180.0 * pi;
        double magic = Math.sin(radLat);
        magic = 1 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
        dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
        double mgLat = lat + dLat;
        double mgLon = lon + dLon;
        List<Double> list = new ArrayList<>();

        list.add(mgLon);
        list.add(mgLat);
        return list;
    }

    /**
     * * 火星坐标系 (GCJ-02) to 84 * * @param lon * @param lat * @return
     */
    public static List<Double> gcj_To_Gps84(double lon,double lat) {
        List<Double> transform = transform(lon, lat);
        List<Double> list = new ArrayList<>();
        list.add(lon * 2 - transform.get(0));
        list.add(lat * 2 - transform.get(1));
        return list;
    }

    /**
     * 火星坐标系 (GCJ-02) 与百度坐标系 (BD-09) 的转换算法 将 GCJ-02 坐标转换成 BD-09 坐标
     *
     * @param gg_lat
     * @param gg_lon
     */
    public static List<Double> gcj02_To_Bd09( double gg_lon,double gg_lat) {
        double x = gg_lon, y = gg_lat;
        double z = Math.sqrt(x * x + y * y) + 0.00002 * Math.sin(y * pi);
        double theta = Math.atan2(y, x) + 0.000003 * Math.cos(x * pi);
        double bd_lon = z * Math.cos(theta) + 0.0065;
        double bd_lat = z * Math.sin(theta) + 0.006;
        List<Double> list = new ArrayList<>();

        list.add(bd_lon);
        list.add(bd_lat);
        return list;
    }

    /**
     * * 火星坐标系 (GCJ-02) 与百度坐标系 (BD-09) 的转换算法 * * 将 BD-09 坐标转换成GCJ-02 坐标 * * @param
     * bd_lat * @param bd_lon * @return
     */
    public static List<Double> bd09_To_Gcj02( double bg_lon,double bd_lat) {
        double x = bg_lon - 0.0065, y = bd_lat - 0.006;
        double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * pi);
        double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * pi);
        double gg_lon = z * Math.cos(theta);
        double gg_lat = z * Math.sin(theta);
        List<Double> list = new ArrayList<>();

        list.add(gg_lon);
        list.add(gg_lat);
        return list;
    }

    /**
     * (BD-09)-->84
     *
     * @param bd_latitude
     * @param bd_longitude
     * @return
     */
    public static List<Double> bd09_To_Gps84( double bd_longitude,double bd_latitude) {

        List<Double> list = GpsLocationUtil.bd09_To_Gcj02(bd_longitude, bd_latitude);
        List<Double> list84 = GpsLocationUtil.gcj_To_Gps84(list.get(0),
                list.get(1));
        return list84;

    }

    public static boolean outOfChina(double lat, double lon) {
        if (lat < 0.8293 || lat > 55.8271)
            return true;
        if (lon < 72.004 || lon > 137.8347)
            return true;
        return false;
    }

    public static List<Double> transform(double lon, double lat) {

        double dLat = transformLat(lon - 105.0, lat - 35.0);
        double dLon = transformLon(lon - 105.0, lat - 35.0);
        double radLat = lat / 180.0 * pi;
        double magic = Math.sin(radLat);
        magic = 1 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
        dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
        double mgLat = lat + dLat;
        double mgLon = lon + dLon;
        List<Double> list = new ArrayList<>();
        list.add(mgLon);
        list.add(mgLat);
        return list;
    }

    public static double transformLat(double x, double y) {
        double ret = -100.0 + 2.0 * x + 3.0 * y + 0.2 * y * y + 0.1 * x * y
                + 0.2 * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(y * pi) + 40.0 * Math.sin(y / 3.0 * pi)) * 2.0 / 3.0;
        ret += (160.0 * Math.sin(y / 12.0 * pi) + 320 * Math.sin(y * pi / 30.0)) * 2.0 / 3.0;
        return ret;
    }

    public static double transformLon(double x, double y) {
        double ret = 300.0 + x + 2.0 * y + 0.1 * x * x + 0.1 * x * y + 0.1
                * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(x * pi) + 40.0 * Math.sin(x / 3.0 * pi)) * 2.0 / 3.0;
        ret += (150.0 * Math.sin(x / 12.0 * pi) + 300.0 * Math.sin(x / 30.0
                * pi)) * 2.0 / 3.0;
        return ret;
    }

    public static void main(String[] args) {

        // 北斗芯片获取的经纬度为WGS84地理坐标 31.426896,119.496145
        System.out.println("gps :30.605003, 121.006256");
        List<Double> gcj = gps84_To_Gcj02(121.006256,30.605003);
        System.out.println("gcj :" + gcj);

        List<Double> star = gcj_To_Gps84(gcj.get(0), gcj.get(1));
        System.out.println("star:" + star);


        List<Double> bd = gcj02_To_Bd09(gcj.get(0), gcj.get(1));
        System.out.println("bd  :" + bd);

        List<Double> gcj2 = bd09_To_Gcj02(bd.get(0), bd.get(1));
        System.out.println("gcj :" + gcj2);

//
//        List<Double> aaaa = PositionUtil.gcj02_To_Bd09(30.605003, 121.006256);
//        System.out.println(aaaa.get(0) + "," + aaaa.get(1));
    }
}
