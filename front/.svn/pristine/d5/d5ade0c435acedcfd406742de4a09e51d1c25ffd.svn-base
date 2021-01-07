package com.open.capacity.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2021-01-04 15:53:15
 */

@Getter
@Setter
@Data
public class SysDictTree implements Serializable {
    private static final long serialVersionUID = 1L;

    private String dictId;

    private String dictName;

    private String parentId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private Long creatorId;

    private String creator;

    private String remark;

    private String updator;

    private Integer del;

}
