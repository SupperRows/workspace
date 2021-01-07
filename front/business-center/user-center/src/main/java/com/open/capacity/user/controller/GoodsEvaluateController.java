package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.GoodsEvaluate;
import com.open.capacity.user.service.GoodsEvaluateService;
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
 * @date 2020-09-16 14:05:26
 */
@Slf4j
@RestController
@RequestMapping("evaluate")
@Api(tags = "EVALUATE API")
public class GoodsEvaluateController {

    @Autowired
    private GoodsEvaluateService goodsEvaluateService;

    /**
     * 列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取全部商品评价信息列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:list')")
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = goodsEvaluateService.findAll(params);
        return pageResult;
    }

    /**
     * 保存
     *
     * @param goodsEvaluate
     * @return
     */
    @ApiOperation(value = "保存商品评价信息结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody GoodsEvaluate goodsEvaluate) {
        goodsEvaluateService.save(goodsEvaluate);

        return Result.succeed("保存成功");
    }

    /**
     * 修改
     *
     * @param goodsEvaluate
     * @return
     */
    @ApiOperation(value = "修改商品评价信息结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody GoodsEvaluate goodsEvaluate) {
        goodsEvaluateService.update(goodsEvaluate);

        return Result.succeed("修改成功");
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "删除商品评价信息记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        goodsEvaluateService.delete(id);
        return Result.succeed("删除成功");
    }

}
