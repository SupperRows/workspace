package com.open.capacity.sys.dao;

import com.open.capacity.sys.model.SysDictTree;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author syf
 * @email 597926353@qq.com
 * @date 2021-01-04 15:53:15
 */
@Mapper
public interface SysDictTreeDao {

    int save(SysDictTree sysDictTree);

    int update(SysDictTree sysDictTree);

    int delete(String id);

    List<SysDictTree> findAll(Map<String, Object> params);

}
