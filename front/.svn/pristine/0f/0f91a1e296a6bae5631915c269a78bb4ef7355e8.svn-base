package com.open.capacity.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-14 18:18:06
 */

@Getter
@Setter
@Data
public class Swipper implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String type;

    private String url;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}
