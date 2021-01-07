package com.open.capacity.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.user.dao.BrandsDao;
import com.open.capacity.user.model.Brands;
import com.open.capacity.user.service.BrandsService;
import com.open.capacity.common.web.PageResult;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BrandsServiceImpl implements BrandsService {

    @Autowired
    private BrandsDao brandsDao;

    /**
     * 添加
     *
     * @param brands
     */
    @Override
    public int save(Brands brands) {
        int code = 1;
        String brandsName = brands.getBrandsName();
        if (brandsName != null && !brandsName.equals("")) {
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("searchKey", "brandsName");
            parms.put("searchValue", brandsName);
            List<Brands> list = brandsDao.findAll(parms);
            if (list.size() != 0) {
                code = 0;
            }
        }
        if (code == 1) {
            return brandsDao.save(brands);
        } else {
            return code;
        }
    }

    /**
     * 修改
     *
     * @param brands
     */
    @Override
    public int update(Brands brands) {
        return brandsDao.update(brands);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return brandsDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Brands> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Brands> list = brandsDao.findAll(params);
        PageInfo<Brands> pageInfo = new PageInfo(list);

        return PageResult.<Brands>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
