package com.open.capacity.user.dao;

import com.open.capacity.user.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email
 * @date 2020-09-16 14:04:06
 */
@Mapper
public interface OrderDao {

    int save(Order order);

    int update(Order order);

    int delete(Long id);

    int updateByOrderId(Order order);

    List<Order> findAll(Map<String, Object> params);


}
