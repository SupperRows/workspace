package com.open.capacity.user.service;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.model.GoodsEvaluate;

import java.util.Map;

/**
 * @author syf
 * @email
 * @date 2020-09-16 14:05:26
 */
public interface GoodsEvaluateService {
    /**
     * 添加
     *
     * @param goodsEvaluate
     */
    int save(GoodsEvaluate goodsEvaluate);

    /**
     * 修改
     *
     * @param goodsEvaluate
     */
    int update(GoodsEvaluate goodsEvaluate);

    /**
     * 删除
     *
     * @param id
     */
    int delete(Long id);


    /**
     * 列表
     *
     * @param params
     * @return
     */
    PageResult<GoodsEvaluate> findAll(Map<String, Object> params);

}

