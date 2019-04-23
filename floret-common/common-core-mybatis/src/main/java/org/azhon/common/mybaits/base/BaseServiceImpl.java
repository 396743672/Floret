package org.azhon.common.mybaits.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.azhon.common.utils.BeanUtil;
import org.springframework.validation.annotation.Validated;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.LocalDateTime;

/**
 * 项目名:    Floret
 * 包名       org.azhon.common.mybaits.base
 * 文件名:    BaseServiceImpl
 * 创建时间:  2019-04-23 on 14:00
 * 描述:     TODO
 *
 * @author ZJB
 */

@Validated
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements BaseService<T> {
    private Class<T> modelClass;

    public BaseServiceImpl() {
        Type type = this.getClass().getGenericSuperclass();
        this.modelClass = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[1];
    }

    @Override
    public boolean deleteLogic(Integer id) {
        T entity = BeanUtil.newInstance(modelClass);
        entity.setId(id);
        entity.setUpdatePerson("zd");
        entity.setUpdateTime(LocalDateTime.now());
        entity.setIsDeleted(1);
        return super.removeById(entity);
    }
}
