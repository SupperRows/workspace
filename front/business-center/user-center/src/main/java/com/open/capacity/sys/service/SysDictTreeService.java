package com.open.capacity.sys.service;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.sys.model.SysDictTree;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2021-01-04 15:53:15
 */
public interface SysDictTreeService {
    /**
     * 添加
     *
     * @param sysDictTree
     */
    int save(SysDictTree sysDictTree);

    /**
     * 修改
     *
     * @param sysDictTree
     */
    int update(SysDictTree sysDictTree);

    /**
     * 删除
     *
     * @param id
     */
    int delete(String id);


    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<SysDictTree> findAll(Map<String, Object> params);

    /**
     * 封装树形json格式
     *
     * @param params
     * @return
     */
    List<SysDictTree> getAllTree(Map<String, Object> params);

}

