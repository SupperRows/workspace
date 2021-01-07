package com.open.capacity.user.service;


import com.open.capacity.user.model.Classfiy;
import com.open.capacity.common.web.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-20 14:04:51
 */
public interface ClassfiyService {
    /**
     * 添加
     *
     * @param classfiyDetail
     */
    int save(Classfiy classfiyDetail);

    /**
     * 修改
     *
     * @param classfiyDetail
     */
    int update(Classfiy classfiyDetail);

    /**
     * 删除
     *
     * @param classfiyId
     */
    int delete(String classfiyId);


    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<Classfiy> findAll(Map<String, Object> params);

    /**
     * 封装树形json格式
     */
    List<Classfiy> getAllTree(Map<String, Object> params);

}

