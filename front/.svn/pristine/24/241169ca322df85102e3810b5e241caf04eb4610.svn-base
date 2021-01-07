package com.open.capacity.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.open.capacity.common.web.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.model.UserScores;
import com.open.capacity.user.dao.UserScoresDao;
import com.open.capacity.user.service.UserScoresService;


@Service
public class UserScoresServiceImpl implements UserScoresService {

    @Autowired
    private UserScoresDao userScoresDao;

    /**
     * 添加
     *
     * @param userScores
     */
    @Override
    public int save(UserScores userScores) {
        return userScoresDao.save(userScores);
    }

    /**
     * 修改
     *
     * @param userScores
     */
    @Override
    public int update(UserScores userScores) {
        return userScoresDao.update(userScores);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return userScoresDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<UserScores> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<UserScores> list = userScoresDao.findAll(params);
        PageInfo<UserScores> pageInfo = new PageInfo(list);

        return PageResult.<UserScores>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
