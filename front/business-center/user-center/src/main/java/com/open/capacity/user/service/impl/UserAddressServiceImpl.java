package com.open.capacity.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.user.dao.UserAddressDao;
import com.open.capacity.user.model.UserAddress;
import com.open.capacity.user.service.UserAddressService;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressDao userAddressDao;

    /**
     * 添加
     *
     * @param userAddress
     */
    @Override
    public int save(UserAddress userAddress) {
        return userAddressDao.save(userAddress);
    }

    /**
     * 修改
     *
     * @param userAddress
     */
    @Override
    public int update(UserAddress userAddress) {
        if (userAddress.getIsdefault() == 1) {
            if (userAddress.getUserId() != null && !userAddress.getUserId().equals("")) {
                Map<String, Object> param = new HashMap<String, Object>();
                param.put("searchKey", "userId");
                param.put("searchValue", userAddress.getUserId());
                List<UserAddress> list = userAddressDao.findAll(param);
                for (UserAddress address : list) {
                    if (address.getIsdefault() == 1) {
                        address.setIsdefault(0);
                        userAddressDao.update(address);
                    }
                }
            }
        }
        return userAddressDao.update(userAddress);
    }


    /**
     * 删除
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return userAddressDao.delete(id);
    }


    /**
     * 列表
     *
     * @param params
     * @return
     */
    @Override
    public PageResult<UserAddress> findAll(Map<String, Object> params) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        if (MapUtils.getInteger(params, "page") != null && MapUtils.getInteger(params, "limit") != null) {
            PageHelper.startPage(MapUtils.getInteger(params, "page"), MapUtils.getInteger(params, "limit"), true);
        }

        List<UserAddress> list = userAddressDao.findAll(params);
        PageInfo<UserAddress> pageInfo = new PageInfo(list);

        return PageResult.<UserAddress>builder().data(pageInfo.getList()).code(0).count(pageInfo.getTotal()).build();
    }

}
