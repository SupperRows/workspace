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
 * @date 2020-10-09 10:10:58
 */

@Getter
@Setter
@Data
public class UserRanks implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer rankId;

    private String rankName;

    private Integer startScore;

    private Integer endScore;

    private Integer rebate;

    private String userrankImg;

    private Integer dataflag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;

}
