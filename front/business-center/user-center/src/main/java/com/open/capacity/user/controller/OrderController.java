package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Order;
import com.open.capacity.user.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @author syf
 * @email
 * @date 2020-09-16 14:04:06
 */
@Slf4j
@RestController
@RequestMapping("order")
@Api(tags = "ORDER API")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取全部订单信息列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('brandstb:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = orderService.findAll(params);
        return pageResult;
    }

    /**
     * 关联查询列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取全部订单商品信息列表")
    @GetMapping("/orderlist")
    @PreAuthorize("hasAnyAuthority('brandstb:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult findOrderAndGoods(@RequestParam Map<String, Object> params) {
        PageResult pageResult = orderService.findOrderAndGoods(params);
        return pageResult;
    }


    /**
     * 保存
     *
     * @param order
     * @return
     */
    @ApiOperation(value = "保存订单信息结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('brandstb:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Order order) {
        orderService.save(order);

        return Result.succeed("保存成功");
    }

    /**
     * 修改
     *
     * @param order
     * @return
     */
    @ApiOperation(value = "修改订单信息结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('brandstb:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Order order) {
        orderService.update(order);

        return Result.succeed("修改成功");
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "删除订单信息记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('brandstb:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        orderService.delete(id);
        return Result.succeed("删除成功");
    }

}
