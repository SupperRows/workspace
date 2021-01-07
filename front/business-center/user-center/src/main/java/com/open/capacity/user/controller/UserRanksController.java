package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.UserRanks;
import com.open.capacity.user.service.UserRanksService;
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
 * @date 2020-10-09 10:10:58
 */
@Slf4j
@RestController
@RequestMapping("/userranks")
@Api(tags = "UserRanks API")
public class UserRanksController {

    @Autowired
    private UserRanksService userRanksService;

    /**
     * 列表
     */

    @ApiOperation(value = "获取全部用户等级列表}")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('user_ranks:userranks:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = userRanksService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */

    @ApiOperation(value = "保存用户等级结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody UserRanks userRanks) {
        userRanksService.save(userRanks);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */

    @ApiOperation(value = "修改用户等级结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody UserRanks userRanks) {
        userRanksService.update(userRanks);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除用户等级记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long rankId) {
        userRanksService.delete(rankId);
        return Result.succeed("删除成功");
    }

}
