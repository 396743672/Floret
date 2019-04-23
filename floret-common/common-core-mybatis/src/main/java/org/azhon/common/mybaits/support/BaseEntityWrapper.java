package org.azhon.common.mybaits.support;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
import java.util.stream.Collectors;


/**
 * 项目名:    ziding-whp
 * 包名       com.ziding.common.support
 * 文件名:    BaseEntityWrapper
 * 创建时间:  2019/3/4 on 下午2:39
 * 描述:     TODO 视图包装基类
 *
 * @author ZJB
 */
public abstract class BaseEntityWrapper<E, V> {

    /**
     * 单个实体类包装
     *
     * @param entity
     * @return
     */
    public abstract V entityVO(E entity);

    /**
     * 实体类集合包装
     *
     * @param list
     * @return
     */
    public List<V> listVO(List<E> list) {
        return list.stream().map(this::entityVO).collect(Collectors.toList());
    }

    /**
     * 分页实体类集合包装
     *
     * @param pages
     * @return
     */
    public IPage<V> pageVO(IPage<E> pages) {
        List<V> records = listVO(pages.getRecords());
        IPage<V> pageVo = new Page<>(pages.getCurrent(), pages.getSize(), pages.getTotal());
        pageVo.setRecords(records);
        return pageVo;
    }

}
