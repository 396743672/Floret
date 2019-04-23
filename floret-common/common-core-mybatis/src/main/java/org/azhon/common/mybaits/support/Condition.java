package org.azhon.common.mybaits.support;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.azhon.common.utils.BeanUtil;
import org.azhon.common.utils.ObjectUtil;
import org.azhon.common.utils.StringUtil;

import java.util.Map;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.support
 * 文件名:    Condition
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO 分页工具
 *
 * @author ZJB
 */
public class Condition {

    /**
     * 转化成mybatis plus中的Page
     *
     * @param query
     * @return
     */
    public static <T> IPage<T> getPage(Query query) {
        Page<T> page = new Page<>(query.getCurrent(), query.getSize());
        page.setAsc(null == query.getAscs() ? new String[]{} : query.getAscs().split(","));
        page.setDesc(null == query.getDescs() ? new String[]{} : query.getAscs().split(","));
        return page;
    }

    /**
     * 获取mybatis plus中的QueryWrapper
     *
     * @param entity
     * @param <T>
     * @return
     */
    public static <T> QueryWrapper<T> getQueryWrapper(T entity) {
        return new QueryWrapper<>(entity);
    }

    /**
     * 获取mybatis plus中的QueryWrapper
     *
     * @param query
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> QueryWrapper<T> getQueryWrapper(Map<String, Object> query, Class<T> clazz) {
        query.remove("current");
        query.remove("size");
        QueryWrapper<T> qw = new QueryWrapper<>();
        qw.setEntity(BeanUtil.newInstance(clazz));
        if (!ObjectUtil.isEmpty(query)) {
            query.forEach((k, v) -> {
                if (!ObjectUtil.isEmpty(v)) {
                    qw.like(StringUtil.humpToUnderline(k), v);
                }
            });
        }
        return qw;
    }

}
