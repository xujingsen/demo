package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class B01User implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long id;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户头像
     */
    private String pic;

    /**
     * 注册时间
     */
    private Date registTime;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 微信openid
     */
    private String wechatOpenid;

    /**
     * 用户当前登录时间
     */
    private Date currentLoginTime;

    /**
     * 用户登录类型
     */
    private Integer appType;

    /**
     * 是否为商家
     */
    private Integer isShop;

    /**
     * 商家id
     */
    private Long shopId;

    /**
     * 商家名称
     */
    private String shopName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否实名认证
     */
    private Integer isAuthentication;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 删除标识
     */
    private Integer deleteFlag;
}
