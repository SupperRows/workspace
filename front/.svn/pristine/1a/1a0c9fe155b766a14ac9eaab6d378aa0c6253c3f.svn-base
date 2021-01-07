package com.open.capacity.sys.controller;

import com.open.capacity.common.TreeNode;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.sys.model.SysDictTree;
import com.open.capacity.sys.service.SysDictTreeService;
import com.open.capacity.utils.BuildTreeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2021-01-04 15:53:15
 */
@Slf4j
@RestController
@RequestMapping("/dicttree")
@Api(tags = "DICT API")
public class SysDictTreeController {

    @Autowired
    private SysDictTreeService sysDictTreeService;

    /**
     * 列表
     */
    @ApiOperation(value = "获取全部字典树列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = sysDictTreeService.findAll(params);
        return pageResult;
    }

    @ApiOperation(value = "获取全部左侧字典树形结构列表")
    @GetMapping("/treeList")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result getDictTreeList(@RequestParam Map<String, Object> params) {

        List<SysDictTree> lists = sysDictTreeService.getAllTree(params);
        BuildTreeUtil tree = new BuildTreeUtil();
        List<TreeNode> lt = new ArrayList<TreeNode>();
        for (int i = 0; i < lists.size(); i++) {
            TreeNode t = new TreeNode();
            t.setId(lists.get(i).getDictId());
            t.setTitle(lists.get(i).getDictName());
            t.setParentId(lists.get(i).getParentId());
            lt.add(t);
        }
        List<Object> list = tree.treeTop(lt);
        return Result.succeed(list, "查询成功");
    }


    /**
     * 保存
     */
    @ApiOperation(value = "保存左侧字典树结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody SysDictTree sysDictTree) {
        sysDictTreeService.save(sysDictTree);
        return Result.succeed("保存成功");
    }

    /**
     * 修改
     */
    @ApiOperation(value = "修改左侧字典树结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody SysDictTree sysDictTree) {
        sysDictTreeService.update(sysDictTree);
        return Result.succeed("修改成功");
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除左侧字典树记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable String dictId) {
        sysDictTreeService.delete(dictId);
        return Result.succeed("删除成功");
    }

}
