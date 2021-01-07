package com.open.capacity.sys.service.impl;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.sys.dao.SysDictDetailDao;
import com.open.capacity.sys.model.SysDictDetail;
import com.open.capacity.sys.service.SysDictDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;


@Service
public class SysDictDetailServiceImpl implements SysDictDetailService {

    @Autowired
    private SysDictDetailDao sysDictDetailDao;

    /**
     * 添加
     *
     * @param sysDictDetail
     */
    @Override
    public int save(SysDictDetail sysDictDetail) {
        return sysDictDetailDao.save(sysDictDetail);
    }

    /**
     * 修改
     *
     * @param sysDictDetail
     */
    @Override
    public int update(SysDictDetail sysDictDetail) {
        return sysDictDetailDao.update(sysDictDetail);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return sysDictDetailDao.delete(id);
    }

    /**
     * 通过dictId删除
     *
     * @param dictId
     */
    @Override
    public int deleteByDictId(String dictId) {
        return sysDictDetailDao.deleteByDictId(dictId);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<SysDictDetail> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<SysDictDetail> list = sysDictDetailDao.findAll(params);
        PageInfo<SysDictDetail> pageInfo = new PageInfo(list);

        return PageResult.<SysDictDetail>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

    /**
     * 通过dictId查询列表
     *
     * @param dictId
     * @return
     */
    @Override
    public PageResult<SysDictDetail> findByDictId(String dictId, int page, int limit) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(page, limit);
        List<SysDictDetail> list = sysDictDetailDao.findByDictId(dictId);
        PageInfo<SysDictDetail> pageInfo = new PageInfo(list);
        return PageResult.<SysDictDetail>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
