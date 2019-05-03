package org.azhon.user.entity;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 项目名:    Floret
 * 包名       org.azhon.user.entity
 * 文件名:    UserDetail
 * 创建时间:  2019-05-03 on 14:28
 * 描述:     TODO
 *
 * @author ZJB
 */
@Data
@ApiModel(description = "用户信息详情")
public class UserDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户基础信息
     */
    @ApiModelProperty(value = "用户")
    private User user;

    /**
     * 权限标识集合
     */
    @ApiModelProperty(value = "权限集合")
    private List<String> permissions;

    /**
     * 角色集合
     */
    @ApiModelProperty(value = "角色集合")
    private List<String> roles;

}
