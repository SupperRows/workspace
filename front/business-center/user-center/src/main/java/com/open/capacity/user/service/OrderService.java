package com.open.capacity.user.service;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.model.Order;

import java.util.Map;

/**
 * @author syf
 * @email
 * @date 2020-09-16 14:04:06
 */
public interface OrderService {
    /**
     * 添加
     *
     * @param order
     */
    int save(Order order);

    /**
     * 修改
     *
     * @param order
     */
    int update(Order order);

    /**
     * 删除
     *
     * @param id
     */
    int delete(Long id);


    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<Order> findAll(Map<String, Object> params);

    /**
     * 联合查询列表
     *
     * @param params
     * @return
     */
    PageResult<Order> findOrderAndGoods(Map<String, Object> params);
}

