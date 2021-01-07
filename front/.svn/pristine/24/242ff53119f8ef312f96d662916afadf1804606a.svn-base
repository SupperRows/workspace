package com.open.capacity.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.dao.PayinfoDao;
import com.open.capacity.user.model.Payinfo;
import com.open.capacity.user.service.PayinfoService;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@Service
public class PayinfoServiceImpl implements PayinfoService {

    @Autowired
    private PayinfoDao payinfoDao;

    /**
     * 添加
     *
     * @param payinfo
     */
    @Override
    public int save(Payinfo payinfo) {
        payinfo.setPayId(UUID.randomUUID().toString().replace("-", ""));
        return payinfoDao.save(payinfo);
    }

    /**
     * 修改
     *
     * @param payinfo
     */
    @Override
    public int update(Payinfo payinfo) {
        return payinfoDao.update(payinfo);
    }


    /**
     * 删除
     *
     * @param payId
     */
    @Override
    public int delete(String payId) {
        return payinfoDao.delete(payId);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<Payinfo> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<Payinfo> list = payinfoDao.findAll(params);
        PageInfo<Payinfo> pageInfo = new PageInfo(list);

        return PageResult.<Payinfo>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
