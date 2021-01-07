package com.open.capacity.user.dao;

import com.open.capacity.user.model.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-15 17:38:03
 */
@Mapper
public interface CartDao {

    int save(Cart cart);

    int update(Cart cart);

    int delete(String carId);

    List<Cart> findAll(Map<String, Object> params);

}
