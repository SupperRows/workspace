package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.UserScores;
import com.open.capacity.user.service.UserScoresService;
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
 * @date 2020-10-09 10:07:59
 */
@Slf4j
@RestController
@RequestMapping("/userscores")
@Api(tags = "UserScores API")
public class UserScoresController {

    @Autowired
    private UserScoresService userScoresService;

    /**
     * 列表
     */

    @ApiOperation(value = "获取全部用户积分列表}")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('user_scores:userscores:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = userScoresService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */

    @ApiOperation(value = "保存用户积分结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody UserScores userScores) {
        userScoresService.save(userScores);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */

    @ApiOperation(value = "修改用户积分结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody UserScores userScores) {
        userScoresService.update(userScores);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除用户积分记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long scoreid) {
        userScoresService.delete(scoreid);
        return Result.succeed("删除成功");
    }

}
