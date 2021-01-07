package com.open.capacity.user.controller;

import com.open.capacity.common.TreeNode;
import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Classfiy;
import com.open.capacity.user.service.ClassfiyService;
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
 * @date 2020-10-20 14:04:52
 */
@Slf4j
@RestController
@RequestMapping("/classfiy")
@Api(tags = "CLASSFIY API")
public class ClassfiyController {


    @Autowired
    private ClassfiyService classfiyDetailService;


    /**
     * 获取分类列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取分类列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult secondaryList(@RequestParam Map<String, Object> params) {
        PageResult pageResult = classfiyDetailService.findAll(params);
        return pageResult;
    }

    /**
     * 获取树形结构列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取全部树形结构分类列表")
    @GetMapping("/treeList")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result getAllTree(@RequestParam Map<String, Object> params) {
        List<Classfiy> lists = classfiyDetailService.getAllTree(params);
        BuildTreeUtil tree = new BuildTreeUtil();
        List<TreeNode> lt = new ArrayList<TreeNode>();
        for (int i = 0; i < lists.size(); i++) {
            TreeNode t = new TreeNode();
            t.setId(lists.get(i).getClassfiyId());
            t.setTitle(lists.get(i).getClassfiyName());
            t.setUrl(lists.get(i).getImgUrl());
            t.setParentId(lists.get(i).getParentId());
            t.setIsShow(lists.get(i).getIsShow());
            lt.add(t);
        }
        List<Object> list = tree.treeTop(lt);
        return Result.succeed(list, "查询成功");
    }

    /**
     * 保存分类信息
     *
     * @param classfiyDetail
     * @return
     */
    @ApiOperation(value = "保存分类结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result secondarySave(@RequestBody Classfiy classfiyDetail) {
        classfiyDetailService.save(classfiyDetail);
        return Result.succeed("保存成功");
    }

    /**
     * 修改分类信息
     *
     * @param classfiyDetail
     * @return
     */
    @ApiOperation(value = "修改分类结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result secondaryUpdate(@RequestBody Classfiy classfiyDetail) {
        classfiyDetailService.update(classfiyDetail);
        return Result.succeed("修改成功");
    }

    /**
     * 删除分类信息
     *
     * @param classfiyId
     * @return
     */
    @ApiOperation(value = "删除分类记录")
    @DeleteMapping("/delete/{classfiyId}")
    @PreAuthorize("hasAnyAuthority('goodsAdmin:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result secondaryDelete(@PathVariable String classfiyId) {
        classfiyDetailService.delete(classfiyId);
        return Result.succeed("删除成功");
    }

}
