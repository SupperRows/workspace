package com.open.capacity.user.service;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.model.Order;
import com.open.capacity.user.model.Refund;

import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-11-08 12:38:22
 */
public interface RefundService {
    /**
     * 添加
     *
     * @param refund
     */
    int save(Refund refund);

    /**
     * 修改
     *
     * @param refund
     */
    int update(Refund refund);

    /**
     * 审核退款修改订单状态
     *
     * @param refund
     * @param order
     */
    int examineRefunds(Refund refund, Order order);

    /**
     * 申请退款
     *
     * @param refund
     * @param order
     */
    int submitRefunds(Refund refund, Order order);

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
    PageResult<Refund> findAll(Map<String, Object> params);

}

