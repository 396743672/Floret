package org.azhon.common.mybaits.base;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 项目名:    Floret
 * 包名       org.azhon.common.mybaits.base
 * 文件名:    BaseService
 * 创建时间:  2019-04-23 on 13:47
 * 描述:     TODO
 *
 * @author ZJB
 */

public interface BaseService<T> extends IService<T> {
    /**
     * 逻辑删除
     *
     * @param id id集合(逗号分隔)
     * @return
     */
    boolean deleteLogic(Integer id);


}
