package com.open.capacity.utils;


import com.open.capacity.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 树形结构工具类
 *
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-15 17:38:03
 */
public class BuildTreeUtil {

    public List<TreeNode> list;

    /**
     * 查询所有根节点
     *
     * @param treeNodeList
     * @return
     */
    public List<Object> treeTop(List<TreeNode> treeNodeList) {
        this.list = treeNodeList;
        List<Object> list = new ArrayList<Object>();
        for (TreeNode node : treeNodeList) {
            Map<String, Object> map = new LinkedHashMap<String, Object>();
            if (node.getParentId().equals("0")) {
                map.put("id", node.getId());
                map.put("title", node.getTitle());
                map.put("url", node.getUrl());
                map.put("parentId", node.getParentId());
                map.put("isShow", node.getIsShow());
                map.put("children", treeChild(node.getId()));
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 递归查询所有叶子节点
     *
     * @param id
     * @return
     */
    public List<Object> treeChild(String id) {
        List<Object> lists = new ArrayList<Object>();
        for (TreeNode node : list) {
            Map<String, Object> childMap = new LinkedHashMap<String, Object>();
            if (node.getParentId().equals(id)) {
                childMap.put("id", node.getId());
                childMap.put("title", node.getTitle());
                childMap.put("url", node.getUrl());
                childMap.put("parentId", node.getParentId());
                childMap.put("isShow", node.getIsShow());
                childMap.put("children", treeChild(node.getId()));
                lists.add(childMap);
            }
        }
        return lists;
    }


}
