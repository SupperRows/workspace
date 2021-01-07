package com.open.capacity.user.service.impl;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.dao.GoodsDao;
import com.open.capacity.user.service.GoodsService;


@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    /**
     * 添加
     *
     * @param goods
     */
    @Override
    public int save(Goods goods) {
        return goodsDao.save(goods);
    }

    /**
     * 修改
     *
     * @param goods
     */
    @Override
    public int update(Goods goods) {
        return goodsDao.update(goods);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return goodsDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Goods> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Goods> list = goodsDao.findAll(params);
        PageInfo<Goods> pageInfo = new PageInfo(list);

        return PageResult.<Goods>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
