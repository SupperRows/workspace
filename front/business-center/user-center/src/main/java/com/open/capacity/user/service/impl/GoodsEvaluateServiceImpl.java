package com.open.capacity.user.service.impl;

import com.open.capacity.common.web.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.model.GoodsEvaluate;
import com.open.capacity.user.dao.GoodsEvaluateDao;
import com.open.capacity.user.service.GoodsEvaluateService;


@Service
public class GoodsEvaluateServiceImpl implements GoodsEvaluateService {

    @Autowired
    private GoodsEvaluateDao goodsEvaluateTbDao;

    /**
     * 添加
     *
     * @param goodsEvaluate
     */
    @Override
    public int save(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateTbDao.save(goodsEvaluate);
    }

    /**
     * 修改
     *
     * @param goodsEvaluate
     */
    @Override
    public int update(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateTbDao.update(goodsEvaluate);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return goodsEvaluateTbDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<GoodsEvaluate> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<GoodsEvaluate> list = goodsEvaluateTbDao.findAll(params);
        PageInfo<GoodsEvaluate> pageInfo = new PageInfo(list);

        return PageResult.<GoodsEvaluate>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
