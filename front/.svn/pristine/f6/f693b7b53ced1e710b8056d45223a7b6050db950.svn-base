package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Payinfo;
import com.open.capacity.user.service.PayinfoService;
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
 * @date 2020-10-15 17:38:07
 */
@Slf4j
@RestController
@RequestMapping("/payinfo")
@Api(tags = "PAYINFO API")
public class PayinfoController {

    @Autowired
    private PayinfoService payinfoService;

    /**
     * 列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取全部支付信息列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = payinfoService.findAll(params);
        return pageResult;
    }

    /**
     * 保存
     *
     * @param payinfo
     * @return
     */
    @ApiOperation(value = "保存支付信息结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Payinfo payinfo) {
        payinfoService.save(payinfo);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     *
     * @param payinfo
     * @return
     */
    @ApiOperation(value = "修改支付信息结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Payinfo payinfo) {
        payinfoService.update(payinfo);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     *
     * @param payId
     * @return
     */
    @ApiOperation(value = "删除支付信息记录")
    @DeleteMapping("/delete/{payId}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable String payId) {
        payinfoService.delete(payId);
        return Result.succeed("删除成功");
    }

}
