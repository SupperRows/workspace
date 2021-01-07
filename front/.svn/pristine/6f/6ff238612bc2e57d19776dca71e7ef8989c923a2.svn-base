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
 * @date 2020-10-15 17:38:03
 */

@Getter
@Setter
@Data
public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String carId;

    private String userId;

    private Long goodsId;

    private Integer quantity;

    private Integer checked;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}
