package com.open.capacity.user.controller;

import com.open.capacity.common.web.PageResult;
import com.open.capacity.common.web.Result;
import com.open.capacity.log.annotation.LogAnnotation;
import com.open.capacity.user.model.Goods;
import com.open.capacity.user.service.GoodsService;
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
 * @date 2020-09-16 14:07:28
 */
@Slf4j
@RestController
@RequestMapping("goods")
@Api(tags = "GOODS API")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 列表
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "获取全部商品信息列表")
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('brandstb:list')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public PageResult list(@RequestParam Map<String, Object> params) {
        PageResult pageResult = goodsService.findAll(params);
        return pageResult;
    }


    /**
     * 保存
     *
     * @param goods
     * @return
     */
    @ApiOperation(value = "保存商品信息结果")
    @PutMapping("/save")
    @PreAuthorize("hasAnyAuthority('brandstb:save')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result save(@RequestBody Goods goods) {
        goodsService.save(goods);

        return Result.succeed("保存成功");
    }

    /**
     * 修改
     *
     * @param goods
     * @return
     */
    @ApiOperation(value = "修改商品信息结果")
    @PostMapping("/update")
    @PreAuthorize("hasAnyAuthority('brandstb:update')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result update(@RequestBody Goods goods) {
        goodsService.update(goods);

        return Result.succeed("修改成功");
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "删除商品信息记录")
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('brandstb:delete')")
    @LogAnnotation(module = "user-center", recordRequestParam = false)
    public Result delete(@PathVariable Long id) {
        goodsService.delete(id);
        return Result.succeed("删除成功");
    }

}
