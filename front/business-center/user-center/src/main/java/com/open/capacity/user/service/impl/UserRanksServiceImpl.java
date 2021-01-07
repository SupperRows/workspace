package com.open.capacity.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.open.capacity.common.web.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.model.UserRanks;
import com.open.capacity.user.dao.UserRanksDao;
import com.open.capacity.user.service.UserRanksService;


@Service
public class UserRanksServiceImpl implements UserRanksService {

    @Autowired
    private UserRanksDao userRanksDao;

    /**
     * 添加
     *
     * @param userRanks
     */
    @Override
    public int save(UserRanks userRanks) {
        return userRanksDao.save(userRanks);
    }

    /**
     * 修改
     *
     * @param userRanks
     */
    @Override
    public int update(UserRanks userRanks) {
        return userRanksDao.update(userRanks);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return userRanksDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<UserRanks> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<UserRanks> list = userRanksDao.findAll(params);
        PageInfo<UserRanks> pageInfo = new PageInfo(list);

        return PageResult.<UserRanks>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
