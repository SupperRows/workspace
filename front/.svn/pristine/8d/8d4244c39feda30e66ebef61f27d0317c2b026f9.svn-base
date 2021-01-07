package com.open.capacity.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.user.dao.CartDao;
import com.open.capacity.user.model.Cart;
import com.open.capacity.user.service.CartService;
import com.open.capacity.common.web.PageResult;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    /**
     * 添加
     *
     * @param cart
     */
    @Override
    public int save(Cart cart) {
        cart.setCarId(UUID.randomUUID().toString().replace("-", ""));
        return cartDao.save(cart);
    }

    /**
     * 修改
     *
     * @param cart
     */
    @Override
    public int update(Cart cart) {
        return cartDao.update(cart);
    }


    /**
     * 删除
     *
     * @param carId
     */
    @Override
    public int delete(String carId) {
        return cartDao.delete(carId);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Cart> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Cart> list = cartDao.findAll(params);
        PageInfo<Cart> pageInfo = new PageInfo(list);

        return PageResult.<Cart>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
