package com.open.capacity.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.dao.OrderDao;
import com.open.capacity.user.dao.RefundDao;
import com.open.capacity.user.model.Order;
import com.open.capacity.user.model.Refund;
import com.open.capacity.user.service.RefundService;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class RefundServiceImpl implements RefundService {

    @Autowired
    private RefundDao refundDao;
    @Autowired
    private OrderDao orderDao;

    /**
     * 添加
     *
     * @param refund
     */
    @Override
    public int save(Refund refund) {
        return refundDao.save(refund);
    }

    /**
     * 修改
     *
     * @param refund
     */
    @Override
    public int update(Refund refund) {
        return refundDao.update(refund);
    }

    /**
     * 审核退款修改订单状态
     *
     * @param refund
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public int examineRefunds(Refund refund, Order order) {
        int i = 0, r = 0;
        if (refund != null && order != null) {
            i = refundDao.update(refund);
            Map map = new HashMap<String, Object>();
            map.put("orderId", order.getOrderId());
            List<Order> list = orderDao.findAll(map);
            if (list.size() != 0) {
                r = orderDao.updateByOrderId(order);
            } else {
                r = 0;
            }
        } else {
            i = 0;
            r = 0;
        }
        return (i == 1 && r == 1) ? 1 : 0;
    }

    /**
     * 申请退款
     *
     * @param refund
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public int submitRefunds(Refund refund, Order order) {
        int i = 0, r = 0;
        if (refund != null && order != null) {
            i = refundDao.save(refund);
            Map map = new HashMap<String, Object>();
            map.put("orderId", order.getOrderId());
            List<Order> list = orderDao.findAll(map);
            if (list.size() != 0) {
                r = orderDao.updateByOrderId(order);
            } else {
                r = 0;
            }
        } else {
            i = 0;
            r = 0;
        }
        return (i == 1 && r == 1) ? 1 : 0;
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return refundDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Refund> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Refund> list = refundDao.findAll(params);
        PageInfo<Refund> pageInfo = new PageInfo(list);

        return PageResult.<Refund>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
