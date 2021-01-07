package com.open.capacity.sys.service;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.sys.model.SysDictDetail;

import java.util.Map;

/**
 * 字典表
 *
 * @author syf
 * @email
 * @date 2020-09-18 15:34:11
 */
public interface SysDictDetailService {
    /**
     * 添加
     *
     * @param sysDictDetail
     */
    int save(SysDictDetail sysDictDetail);

    /**
     * 修改
     *
     * @param sysDictDetail
     */
    int update(SysDictDetail sysDictDetail);

    /**
     * 通过主键删除
     *
     * @param id
     */
    int delete(Long id);

    /**
     * 通过dictId删除
     *
     * @param dictId
     */
    int deleteByDictId(String dictId);

    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<SysDictDetail> findAll(Map<String, Object> params);

    /**
     * 通过dictId查询列表
     *
     * @param dictId
     * @return
     */
    PageResult<SysDictDetail> findByDictId(String dictId, int page, int limit);

}

