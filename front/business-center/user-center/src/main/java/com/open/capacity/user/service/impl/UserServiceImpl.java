package com.open.capacity.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.open.capacity.common.web.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.model.User;
import com.open.capacity.user.dao.UserDao;
import com.open.capacity.user.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 添加
     *
     * @param user
     */
    @Override
    public int save(User user) {
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        return userDao.save(user);
    }

    /**
     * 修改
     *
     * @param user
     */
    @Override
    public int update(User user) {
        return userDao.update(user);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return userDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<User> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<User> list = userDao.findAll(params);
        PageInfo<User> pageInfo = new PageInfo(list);

        return PageResult.<User>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
