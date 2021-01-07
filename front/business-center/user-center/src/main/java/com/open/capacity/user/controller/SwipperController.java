package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Swipper;
import com.open.capacity.user.service.SwipperService;
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
 * @date 2020-10-14 18:18:06
 */
@Slf4j
@RestController
@RequestMapping("/swipper")
@Api(tags = "Swipper API")
public class SwipperController {

    @Autowired
    private SwipperService swipperService;

    /**
     * 列表
     */

    @ApiOperation(value = "获取全部轮播列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = swipperService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */

    @ApiOperation(value = "保存轮播结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Swipper swipper) {
        swipperService.save(swipper);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */

    @ApiOperation(value = "修改轮播结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Swipper swipper) {
        swipperService.update(swipper);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除轮播记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        swipperService.delete(id);
        return Result.succeed("删除成功");
    }

}
