package com.open.capacity.user.controller;

import com.alibaba.fastjson.JSON;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Order;
import com.open.capacity.user.model.Refund;
import com.open.capacity.user.service.RefundService;
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
 * @date 2020-11-08 12:38:22
 */
@Slf4j
@RestController
@RequestMapping("/refund")
@Api(tags = "Refund API")
public class RefundController {

    @Autowired
    private RefundService refundService;

    /**
     * 列表
     */
    @ApiOperation(value = "获取全部refund列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = refundService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */
    @ApiOperation(value = "保存refund结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Refund refund) {
        refundService.save(refund);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */
    @ApiOperation(value = "修改refund结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Refund refund) {
        refundService.update(refund);
        return Result.succeed("修改成功");
    }

    /**
     * 审核退款修改订单状态
     */
    @ApiOperation(value = "审核退款修改订单状态")
    @PostMapping("/toexamine")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result examineRefunds(@RequestBody Map<String, Object> map) {
        Refund refund = JSON.parseObject(JSON.toJSONString(map.get("refund")), Refund.class);
        Order order = JSON.parseObject(JSON.toJSONString(map.get("order")), Order.class);
        int res = refundService.examineRefunds(refund, order);
        return res == 1 ? Result.succeed("审核提交成功!") : Result.failed("审核提交失败!");
    }

    /**
     * 申请退款
     */
    @ApiOperation(value = "申请退款")
    @PostMapping("/tosubmit")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result submitRefunds(@RequestBody Map<String, Object> map) {
        Refund refund = JSON.parseObject(JSON.toJSONString(map.get("refund")), Refund.class);
        Order order = JSON.parseObject(JSON.toJSONString(map.get("order")), Order.class);
        int res = refundService.submitRefunds(refund, order);
        return res == 1 ? Result.succeed("退款申请已提交至后台,请联系客服及时处理!") : Result.failed("退款申请失败,请联系客服处理!");
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除refund记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        refundService.delete(id);
        return Result.succeed("删除成功");
    }

}
