package com.open.capacity.sys.dao;

import com.open.capacity.sys.model.SysDict;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email
 * @date 2020-09-18 15:34:09
 */
@Mapper
public interface SysDictDao {

    int save(SysDict sysDict);

    int update(SysDict sysDict);

    int delete(String dictId);

    List<SysDict> findAll(Map<String, Object> params);

}
