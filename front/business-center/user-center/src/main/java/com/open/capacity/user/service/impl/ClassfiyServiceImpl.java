package com.open.capacity.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.user.dao.ClassfiyDao;
import com.open.capacity.user.model.Classfiy;
import com.open.capacity.user.service.ClassfiyService;
import com.open.capacity.common.web.PageResult;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ClassfiyServiceImpl implements ClassfiyService {

    @Autowired
    private ClassfiyDao classfiyDetailDao;

    /**
     * 添加
     *
     * @param classfiyDetail
     */
    @Override
    public int save(Classfiy classfiyDetail) {
        classfiyDetail.setClassfiyId(UUID.randomUUID().toString().replace("-", ""));
        return classfiyDetailDao.save(classfiyDetail);
    }

    /**
     * 修改
     *
     * @param classfiyDetail
     */
    @Override
    public int update(Classfiy classfiyDetail) {
        return classfiyDetailDao.update(classfiyDetail);
    }


    /**
     * 删除
     *
     * @param classfiyId
     */
    @Override
    public int delete(String classfiyId) {
        return classfiyDetailDao.delete(classfiyId);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Classfiy> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Classfiy> list = classfiyDetailDao.findAll(params);
        PageInfo<Classfiy> pageInfo = new PageInfo(list);

        return PageResult.<Classfiy>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

    /**
     * 树形列表
     *
     * @param params
     * @return
     */
    @Override
    public List<Classfiy> getAllTree(Map<String, Object> params) {
        List<Classfiy> lists = classfiyDetailDao.findAll(params);
        return lists;
    }

}
