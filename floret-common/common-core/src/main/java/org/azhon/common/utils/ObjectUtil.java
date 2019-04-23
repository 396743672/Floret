package org.azhon.common.utils;

import org.springframework.lang.Nullable;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.utils
 * 文件名:    ObjectUtil
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO 对象工具类
 *
 * @author ZJB
 */
public class ObjectUtil extends org.springframework.util.ObjectUtils {

    /**
     * 判断元素不为空
     *
     * @param obj object
     * @return boolean
     */
    public static boolean isNotEmpty(@Nullable Object obj) {
        return !ObjectUtil.isEmpty(obj);
    }

}
