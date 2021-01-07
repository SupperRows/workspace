package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.User;
import com.open.capacity.user.service.UserService;
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
 * @date 2020-10-09 10:13:56
 */
@Slf4j
@RestController
@RequestMapping("/userapp")
@Api(tags = "AppUser API")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 列表
     */

    @ApiOperation(value = "获取全部app用户列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('user:user:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = userService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */

    @ApiOperation(value = "保存app用户结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody User user) {
        userService.save(user);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */

    @ApiOperation(value = "修改app用户结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody User user) {
        userService.update(user);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除app用户记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('generator:sysroleuser:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        userService.delete(id);
        return Result.succeed("删除成功");
    }

}
