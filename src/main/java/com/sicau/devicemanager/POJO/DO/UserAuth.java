package com.sicau.devicemanager.POJO.DO;

import com.sicau.devicemanager.config.validation.group.DeviceValidatedGroup;
import com.sicau.devicemanager.config.validation.group.DeviceValidatedGroup.Login;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 用户身份认证
 * @author BeFondOfTaro
 * Created at 23:41 2018/5/13
 */
@Data
public class UserAuth {

    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 登录认证类型,0：用户名密码登录，1：微信登录
     */
    @NotNull(groups = {Login.class})
    private Integer identifyType;

    /**
     * 标识（手机号 邮箱 用户名或第三方应用的唯一标识）
     */
	@NotNull(groups = {Login.class})
    private String identifier;

    /**
     * 登录凭证
     */
	@NotNull(groups = {Login.class})
    private String credential;

    /**
     * 是否锁定
     */
    private Boolean locked;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
