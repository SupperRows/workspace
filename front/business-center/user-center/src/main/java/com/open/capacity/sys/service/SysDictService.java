package com.open.capacity.sys.service;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.sys.model.SysDict;

import java.util.Map;

/**
 * @author syf
 * @email
 * @date 2020-09-18 15:34:09
 */
public interface SysDictService {
    /**
     * 添加
     *
     * @param sysDict
     */
    int save(SysDict sysDict);

    /**
     * 修改
     *
     * @param sysDict
     */
    int update(SysDict sysDict);

    /**
     * 删除
     *
     * @param dictId
     */
    int delete(String dictId);

    /**
     * 删除全部
     *
     * @param dictId
     */
    void deleteAll(String dictId);

    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<SysDict> findAll(Map<String, Object> params);

}

