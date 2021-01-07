package com.open.capacity.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.open.capacity.common.web.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.user.model.Swipper;
import com.open.capacity.user.dao.SwipperDao;
import com.open.capacity.user.service.SwipperService;


@Service
public class SwipperServiceImpl implements SwipperService {

    @Autowired
    private SwipperDao swipperDao;

    /**
     * 添加
     *
     * @param swipper
     */
    @Override
    public int save(Swipper swipper) {
        return swipperDao.save(swipper);
    }

    /**
     * 修改
     *
     * @param swipper
     */
    @Override
    public int update(Swipper swipper) {
        return swipperDao.update(swipper);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return swipperDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Swipper> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Swipper> list = swipperDao.findAll(params);
        PageInfo<Swipper> pageInfo = new PageInfo(list);

        return PageResult.<Swipper>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
