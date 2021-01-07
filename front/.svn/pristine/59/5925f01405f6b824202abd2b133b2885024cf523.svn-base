package com.open.capacity.sys.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.sys.model.SysDictDetail;
import com.open.capacity.sys.service.SysDictDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 字典表
 *
 * @author syf
 * @email
 * @date 2020-09-18 15:34:11
 */
@Slf4j
@RestController
@RequestMapping("dictdetail")
@Api(tags = "DICT API")
public class SysDictDetailController {

    @Autowired
    private SysDictDetailService sysDictDetailService;

    /**
     * 列表
     */

    @GetMapping("/list")
    @ApiOperation("查询字典详情信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:list')")
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = sysDictDetailService.findAll(params);
        return pageResult;
    }

    /**
     * 通过dictId查询列表
     */

    @GetMapping("/findListByDictId")
    @ApiOperation("通过dictId查询查询字典详情信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:list')")
    public PageResult findListByDictId(@RequestParam(value = "dictId", defaultValue = "afd35863cf814ac6b9204e9a357a572b") String dictId, @RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "10") int limit) {
        PageResult pageResult = sysDictDetailService.findByDictId(dictId, page, limit);
        return pageResult;
    }


    /**
     * 保存
     */

    @PutMapping("/save")
    @ApiOperation("保存字典详情信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:save')")
    public Result save(@RequestBody SysDictDetail sysDictDetail) {
        sysDictDetailService.save(sysDictDetail);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */

    @PostMapping("/update")
    @ApiOperation("修改字典详情信息")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:update')")
    public Result update(@RequestBody SysDictDetail sysDictDetail) {
        sysDictDetailService.update(sysDictDetail);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */

    @ApiOperation(value = "删除字典详情信息记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:delete')")
    public Result delete(@PathVariable Long id) {
        sysDictDetailService.delete(id);
        return Result.succeed("删除成功");
    }

    /**
     * 通过dictId删除
     */

    @ApiOperation(value = "通过dictId删除字典详情信息记录")
    @DeleteMapping("/deleteByDictId/{dictId}")
    @PreAuthorize("hasAnyAuthority('sys_dict:sysdict:delete')")
    public Result delete(@PathVariable String dictId) {
        sysDictDetailService.deleteByDictId(dictId);
        return Result.succeed("删除成功");
    }

}
