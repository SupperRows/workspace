package com.open.capacity.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class TreeNode implements Serializable {
    /**
     * 节点ID
     */
    private String id;
    /**
     * 节点名称
     */
    private String title;
    /**
     * 路径
     */
    private String url;
    /**
     * 父节点ID
     */
    private String parentId;
    /**
     * 是否展示
     */
    private Integer isShow;
    /**
     * 叶子节点
     */
    private List<TreeNode> chilren;

}
