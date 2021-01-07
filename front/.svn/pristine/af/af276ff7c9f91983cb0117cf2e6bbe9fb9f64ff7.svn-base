package com.open.capacity.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author syf
 * @email
 * @date 2020-09-16 14:04:06
 */

@Getter
@Setter
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userId;

    private Long orderId;

    private String userName;

    private String userPhone;

    private String userAddress;

    private Long goodsId;

    private Long transportId;

    private Integer goodsNum;

    private BigDecimal goodsAmount;

    private String orderDelivery;

    private BigDecimal orderAmount;

    private String noteStruct;

    private Integer flag;

    private Integer dataFlag;

    private BigDecimal deliverMoney;

    private BigDecimal totalMoney;

    private BigDecimal realTotalMoney;

    private Integer isInvoice;

    private String invoiceClient;

    private BigDecimal needPay;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deliveryTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date receiveTime;

    private List<Goods> goodsList;

}
