package org.azhon.common.utils;

import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;


/**
 * 项目名:    Floret
 * 包名       org.azhon.common.utils
 * 文件名:    BeanUtil
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO 集合工具类
 *
 * @author ZJB
 */
public class CollectionUtil extends CollectionUtils {

    /**
     * Check whether the given Array contains the given element.
     *
     * @param array   the Array to check
     * @param element the element to look for
     * @param <T>     The generic tag
     * @return {@code true} if found, {@code false} else
     */
    public static <T> boolean contains(@Nullable T[] array, final T element) {
        if (array == null) {
            return false;
        }
        return Arrays.stream(array).anyMatch(x -> ObjectUtil.nullSafeEquals(x, element));
    }

    /**
     * 对象是否为数组对象
     *
     * @param obj 对象
     * @return 是否为数组对象，如果为{@code null} 返回false
     */
    public static boolean isArray(Object obj) {
        if (null == obj) {
            return false;
        }
        return obj.getClass().isArray();
    }

    /**
     * Determine whether the given Collection is not empty:
     * i.e. {@code null} or of zero length.
     *
     * @param coll the Collection to check
     * @return boolean
     */
    public static boolean isNotEmpty(@Nullable Collection<?> coll) {
        return !CollectionUtils.isEmpty(coll);
    }

    /**
     * Determine whether the given Map is not empty:
     * i.e. {@code null} or of zero length.
     *
     * @param map the Map to check
     * @return boolean
     */
    public static boolean isNotEmpty(@Nullable Map<?, ?> map) {
        return !CollectionUtils.isEmpty(map);
    }

}
