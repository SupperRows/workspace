package com.open.capacity.user.service.impl;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.dao.GoodsDao;
import com.open.capacity.user.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.model.Order;
import com.open.capacity.user.dao.OrderDao;
import com.open.capacity.user.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private GoodsDao goodsDao;

    /**
     * 添加
     *
     * @param order
     */
    @Override
    public int save(Order order) {
        return orderDao.save(order);
    }

    /**
     * 修改
     *
     * @param order
     */
    @Override
    public int update(Order order) {
        return orderDao.update(order);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return orderDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Order> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Order> list = orderDao.findAll(params);
        PageInfo<Order> pageInfo = new PageInfo(list);

        return PageResult.<Order>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

    @Override
    public PageResult<Order> findOrderAndGoods(Map<String, Object> params) {
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }
        List<Order> list = orderDao.findAll(params);
        for (Order order : list) {
            Map<String, Object> param = new HashMap<String, Object>();
            param.put("searchKey", "goodsId");
            param.put("searchValue", order.getGoodsId());
            List<Goods> goods = goodsDao.findAll(param);
            order.setGoodsList(goods);
            param.clear();
        }
        PageInfo<Order> pageInfo = new PageInfo(list);

        return PageResult.<Order>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
