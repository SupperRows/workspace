package com.open.capacity.user.dao;

import com.open.capacity.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-09 10:13:56
 */
@Mapper
public interface UserDao {

    int save(User user);

    int update(User user);

    int delete(Long id);

    List<User> findAll(Map<String, Object> params);

}
