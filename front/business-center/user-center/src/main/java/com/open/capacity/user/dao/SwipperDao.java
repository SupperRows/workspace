package com.open.capacity.user.dao;

import com.open.capacity.user.model.Swipper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-14 18:18:06
 */
@Mapper
public interface SwipperDao {

    int save(Swipper swipper);

    int update(Swipper swipper);

    int delete(Long id);

    List<Swipper> findAll(Map<String, Object> params);

}
