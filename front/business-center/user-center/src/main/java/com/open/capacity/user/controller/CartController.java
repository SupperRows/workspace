package com.open.capacity.user.controller;

import com.open.capacity.user.model.Cart;
import com.open.capacity.user.service.CartService;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
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
 * @date 2020-10-15 17:38:03
 */
@Slf4j
@RestController
@RequestMapping("/cart")
@Api(tags = "CART API")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 列表
     */

    @ApiOperation(value = "获取全部购物车列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = cartService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */

    @ApiOperation(value = "保存购物车结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Cart cart) {
        int code = cartService.save(cart);
        if (code == 0) {
            return Result.failed("保存失败");
        } else {
            return Result.succeed("保存成功");
        }
    }

    /**
     * 修改
     */

    @ApiOperation(value = "修改购物车结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Cart cart) {
        int code = cartService.update(cart);
        if (code == 0) {
            return Result.failed("修改失败");
        } else {
            return Result.succeed("修改成功");
        }
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除购物车记录")
    @DeleteMapping("/delete/{carId}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable String carId) {
        int code = cartService.delete(carId);
        if (code == 0) {
            return Result.failed("删除失败");
        } else {
            return Result.succeed("删除成功");
        }
    }

}
