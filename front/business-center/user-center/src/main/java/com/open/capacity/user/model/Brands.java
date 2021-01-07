package com.open.capacity.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 * @email
 * @date 2020-09-13 00:08:40
 */

@Getter
@Setter
@Data
public class Brands implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private int brandsId;

    private String brandsName;

    private String brandsIntroduce;

    private String brandsImg;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
