package org.azhon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 项目名:    Floret
 * 包名       org.azhon.gateway
 * 文件名:    GateWayApplication
 * 创建时间:  2019-05-01 on 14:19
 * 描述:     TODO
 *
 * @author ZJB
 */
@EnableHystrix
@EnableScheduling
@SpringCloudApplication
public class GateWayApplication {


    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
