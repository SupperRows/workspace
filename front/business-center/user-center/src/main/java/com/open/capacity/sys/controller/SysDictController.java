package com.open.capacity.sys.controller;

import java.util.Map;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.sys.model.SysDict;
import com.open.capacity.sys.service.SysDictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;


/**
 * @author syf
 * @email
 * @date 2020-09-18 15:34:09
 */
@Slf4j
@RestController
@RequestMapping("dict")
@Api(tags = "DICT API")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation("查询字典信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:list')")
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = sysDictService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     */
    @PutMapping("/save")
    @ApiOperation("保存字典信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:save')")
    public Result save(@RequestBody SysDict sysDict) {
        sysDictService.save(sysDict);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改字典信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:update')")
    public Result update(@RequestBody SysDict sysDict) {
        sysDictService.update(sysDict);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{dictId}")
    @ApiOperation("删除字典信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:delete')")
    public Result delete(@PathVariable String dictId) {
        sysDictService.delete(dictId);
        return Result.succeed("删除成功");
    }

    /**
     * 删除全部相同dictId
     */
    @DeleteMapping("/deleteAll/{dictId}")
    @ApiOperation("删除全部字典信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:delete')")
    public Result deleteAll(@PathVariable String dictId) {
        sysDictService.deleteAll(dictId);
        return Result.succeed("删除成功");
    }
}
