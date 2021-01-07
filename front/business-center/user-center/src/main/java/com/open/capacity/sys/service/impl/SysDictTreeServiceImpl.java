package com.open.capacity.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.sys.dao.SysDictTreeDao;
import com.open.capacity.sys.model.SysDictTree;
import com.open.capacity.sys.service.SysDictTreeService;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class SysDictTreeServiceImpl implements SysDictTreeService {

    @Autowired
    private SysDictTreeDao sysDictTreeDao;

    /**
     * 添加
     *
     * @param sysDictTree
     */
    @Override
    public int save(SysDictTree sysDictTree) {
        return sysDictTreeDao.save(sysDictTree);
    }

    /**
     * 修改
     *
     * @param sysDictTree
     */
    @Override
    public int update(SysDictTree sysDictTree) {
        return sysDictTreeDao.update(sysDictTree);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(String id) {
        return sysDictTreeDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<SysDictTree> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }
        List<SysDictTree> list = sysDictTreeDao.findAll(params);
        PageInfo<SysDictTree> pageInfo = new PageInfo(list);

        return PageResult.<SysDictTree>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

    /**
     * 封装树形json格式
     *
     * @param params
     * @return
     */
    @Override
    public List<SysDictTree> getAllTree(Map<String, Object> params) {
        return sysDictTreeDao.findAll(null);
    }

}
