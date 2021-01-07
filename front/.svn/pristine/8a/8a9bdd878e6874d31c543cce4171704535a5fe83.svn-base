package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.UserAddress;
import com.open.capacity.user.service.UserAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-09 10:12:10
 */
@Slf4j
@RestController
@RequestMapping("/useraddress")
@Api(tags = "UserAddress API")
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    /**
     * 列表
     */

    @ApiOperation(value = "获取全部收货地址列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:select')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = userAddressService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */

    @ApiOperation(value = "保存收货地址结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody UserAddress userAddress) {
        int code = userAddressService.save(userAddress);
        if (code == 0) {
            return Result.failed("保存失败");
        } else {
            return Result.succeed("保存成功");
        }
    }

    /**
     * 修改
     */

    @ApiOperation(value = "修改收货地址结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody UserAddress userAddress) {
        int code = userAddressService.update(userAddress);
        if (code == 0) {
            return Result.failed("修改失败");
        } else {
            return Result.succeed("修改成功");
        }
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除收货地址记录")
    @DeleteMapping("/delete/{addressId}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long addressId) {
        int code = userAddressService.delete(addressId);
        if (code == 0) {
            return Result.failed("删除失败");
        } else {
            return Result.succeed("删除成功");
        }
    }

}
