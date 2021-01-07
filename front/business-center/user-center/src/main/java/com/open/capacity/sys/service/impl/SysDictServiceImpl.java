package com.open.capacity.sys.service.impl;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.sys.dao.SysDictDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.collections4.MapUtils;

import com.open.capacity.sys.model.SysDict;
import com.open.capacity.sys.dao.SysDictDao;
import com.open.capacity.sys.service.SysDictService;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictDao sysDictDao;

    @Autowired
    private SysDictDetailDao sysDictDetailDao;

    /**
     * 添加
     *
     * @param sysDict
     */
    @Override
    public int save(SysDict sysDict) {
        sysDict.setDictId(UUID.randomUUID().toString().replace("-", ""));
        return sysDictDao.save(sysDict);
    }

    /**
     * 修改
     *
     * @param sysDict
     */
    @Override
    public int update(SysDict sysDict) {
        return sysDictDao.update(sysDict);
    }


    /**
     * 删除
     *
     * @param dictId
     */
    @Override
    public int delete(String dictId) {
        return sysDictDao.delete(dictId);
    }

    /**
     * 删除全部dictId
     *
     * @param dictId
     */
    @Override
    @Transactional
    public void deleteAll(String dictId) {
        sysDictDetailDao.deleteByDictId(dictId);
        sysDictDao.delete(dictId);
    }

    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<SysDict> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<SysDict> list = sysDictDao.findAll(params);
        PageInfo<SysDict> pageInfo = new PageInfo(list);

        return PageResult.<SysDict>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
