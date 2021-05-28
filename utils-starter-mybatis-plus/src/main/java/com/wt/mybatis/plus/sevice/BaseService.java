package com.wt.mybatis.plus.sevice;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author qiyu
 * @date 2021/1/15
 */
public interface BaseService<T> {
    boolean insert(T entity);

    Integer insertBatchSomeColumn(Collection<T> entityList);

    boolean updateById(T entity);

    boolean deleteById(Serializable id);

    T getById(Serializable id);

    List<T> listByIds(Collection<? extends Serializable> ids);

    BaseMapper<T> getBaseMapper();
}
