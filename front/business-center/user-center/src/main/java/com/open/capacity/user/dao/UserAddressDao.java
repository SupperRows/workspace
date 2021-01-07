package com.open.capacity.user.dao;

import com.open.capacity.user.model.UserAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-09 10:12:10
 */
@Mapper
public interface UserAddressDao {

    int save(UserAddress userAddress);

    int update(UserAddress userAddress);

    int delete(Long id);

    List<UserAddress> findAll(Map<String, Object> params);

}
