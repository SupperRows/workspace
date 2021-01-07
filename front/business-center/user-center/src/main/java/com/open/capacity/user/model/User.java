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
 * @date 2020-10-09 10:13:56
 */

@Getter
@Setter
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userId;

    private String openId;

    private String userName;

    private String userGender;

    private String userCity;

    private String userBirthday;

    private String userCountry;

    private String userProvince;

    private String userAvatarurl;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private int dataFlag;

}
