package com.open.capacity.sys.dao;

import com.open.capacity.sys.model.SysDictDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 字典表
 *
 * @author syf
 * @email
 * @date 2020-09-18 15:34:11
 */
@Mapper
public interface SysDictDetailDao {

    int save(SysDictDetail sysDictDetail);

    int update(SysDictDetail sysDictDetail);

    int delete(Long id);

    int deleteByDictId(String dictId);

    List<SysDictDetail> findAll(Map<String, Object> params);

    List<SysDictDetail> findByDictId(String dictId);

}
