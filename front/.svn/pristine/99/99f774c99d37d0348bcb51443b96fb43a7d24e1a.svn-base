package com.open.capacity.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * @author syf
 * @email
 * @date 2020-09-16 14:07:28
 */

@Getter
@Setter
@Data
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Long goodsId;

    private String goodsIntroduce;

    private BigDecimal pagePrice;

    private BigDecimal purchasePrice;

    private String goodsModel;

    private String goodsImg;

    private String pageUrl;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date promotionTime;

    private String classfiyId;

    private Integer brandsId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Integer isSale;

    private Integer isHot;

    private Integer visitNum;

    private Integer appraiseNum;

}
