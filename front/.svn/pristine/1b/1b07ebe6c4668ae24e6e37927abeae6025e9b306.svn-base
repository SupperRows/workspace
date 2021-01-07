package com.open.capacity.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-11-08 12:38:22
 */

@Getter
@Setter
@Data
public class Refund implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Long orderId;

    private String userId;

    private Integer refundTo;

    private String refundDirection;

    private String refundOtherReson;

    private BigDecimal backMoney;

    private String refundTradeNo;

    private String refundRemark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date refundTime;

    private String shopRejectReason;

    private Integer refundStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
