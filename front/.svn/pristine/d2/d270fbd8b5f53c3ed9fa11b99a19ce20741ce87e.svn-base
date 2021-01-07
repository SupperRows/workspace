package com.open.capacity.user.service;

import com.open.capacity.user.model.Cart;
import com.open.capacity.common.web.PageResult;

import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-15 17:38:03
 */
public interface CartService {
    /**
     * 添加
     *
     * @param cart
     */
    int save(Cart cart);

    /**
     * 修改
     *
     * @param cart
     */
    int update(Cart cart);

    /**
     * 删除
     *
     * @param carId
     */
    int delete(String carId);


    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<Cart> findAll(Map<String, Object> params);

}

