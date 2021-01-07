package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Brands;
import com.open.capacity.user.service.BrandsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @author
 * @email
 * @date 2020-09-13 00:08:40
 */
@Slf4j
@RestController
@RequestMapping("/brands")
@Api(tags = "BRANDS API")
public class BrandsController {

    @Autowired
    private BrandsService brandsService;

    /**
     * 列表
     */
    @ApiOperation(value = "获取全部品牌信息列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('brandstb:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = brandsService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */
    @ApiOperation(value = "保存品牌信息结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('brandstb:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Brands brands) {
        int code = brandsService.save(brands);
        if (code == 0) {
            return Result.failed("品牌名称已存在!");
        } else {
            return Result.succeed("保存成功");
        }
    }

    /**
     * 修改
     */
    @ApiOperation(value = "修改品牌信息结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('brandstb:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Brands brands) {
        int code = brandsService.update(brands);
        if (code == 0) {
            return Result.failed("修改失败");
        } else {
            return Result.succeed("修改成功");
        }
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除品牌信息记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('brandstb:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        int code = brandsService.delete(id);
        if (code == 0) {
            return Result.failed("删除失败");
        } else {
            return Result.succeed("删除成功");
        }
    }

}
