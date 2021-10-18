package edu.lingnan.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 出参字段集合类 用于ApiGlobalModel
 * 不可继承 不可实例化 只是字段描述文件
 *
 * GlobalVo类用于存放接口入参字段，这是一个不可实现不可继承的实体类，仅用于字段描述
 * 可以在这个类里定义所有需要的字段，相同的参数可以复用
 * 描述这个实体类使用的是swagger原生注解
 */
@Data
@ApiModel
public abstract class GlobalVo implements Serializable {
    private GlobalVo() {
    }

    @ApiModelProperty(value = "收货地址id", name = "id")
    private Integer addressId;

    @ApiModelProperty(value = "收件人电话")
    private Integer telNumber;

    @ApiModelProperty(value = "购物车id", name = "id")
    private Integer cartId;

    @ApiModelProperty("商品Id")
    private Integer goodsId;

    @ApiModelProperty("sku_id")
    private Integer skuId;

    @ApiModelProperty("数量")
    private Integer number;

    @ApiModelProperty("已选规格列表")
    private String properties;

    @ApiModelProperty(name = "id", value = "用户id")
    private String userId;

    @ApiModelProperty(name = "id", value = "订单id")
    private String orderId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("openId")
    private String openId;

    @ApiModelProperty("手机号码")
    private String mobile;

    @ApiModelProperty("短信验证码")
    private String smsCode;

    @ApiModelProperty("短信验证码Key")
    private String smsCodeKey;

    @ApiModelProperty("图形验证码Key")
    private String captchaKey;

    @ApiModelProperty("图形验证码")
    private String captchaCode;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty(value = "新密码", name = "password")
    private String newPassword;

    @ApiModelProperty("微信code")
    private String code;

    @ApiModelProperty(name = "code", value = "支付宝code")
    private String aliCode;
}
