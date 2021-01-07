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
 * @date 2020-10-09 10:07:59
 */

@Getter
@Setter
@Data
public class UserScores implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer scoreId;

    private String userId;

    private Integer score;

    private Integer change;

    private Integer dataSrc;

    private String dataId;

    private String remarks;

    private Integer scoreType;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
