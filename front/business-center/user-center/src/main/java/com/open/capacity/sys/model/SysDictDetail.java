package com.open.capacity.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 字典表
 *
 * @author syf
 * @email
 * @date 2020-09-18 15:34:11
 */

@Getter
@Setter
@Data
public class SysDictDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String dictId;

    private String value;

    private String label;

    private String type;

    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    private String remarks;

}
