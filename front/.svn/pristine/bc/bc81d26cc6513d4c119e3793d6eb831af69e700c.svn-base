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
 * @date 2020-10-09 10:12:10
 */

@Getter
@Setter
@Data
public class UserAddress implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer addressId;

    private String userId;

    private String userName;

    private String userPhone;

    private String province;

    private String city;

    private String area;

    private String twon;

    private String address;

    private Integer isdefault;

    private Integer dataFlag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;

}
