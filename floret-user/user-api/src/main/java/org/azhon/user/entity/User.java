
package org.azhon.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import org.azhon.common.mybaits.base.BaseEntity;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 包名       org.azhon.user.entity
 * 文件名:    User
 * 创建时间:  2019-05-03
 * 描述:     TODO 实体类
 *
 * @author zjb
 */
@Data
@TableName("floret_user")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "User对象", description = "User对象")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 租户编号
     */
  @ApiModelProperty(value = "租户编号")
  private String tenantCode;

    /**
     * 账号
     */
  @ApiModelProperty(value = "账号")
  private String account;

    /**
     * 密码
     */
  @ApiModelProperty(value = "密码")
  private String password;

    /**
     * 昵称
     */
  @ApiModelProperty(value = "昵称")
  private String name;

    /**
     * 真名
     */
  @ApiModelProperty(value = "真名")
  private String realName;

    /**
     * 邮箱
     */
  @ApiModelProperty(value = "邮箱")
  private String email;

    /**
     * 手机
     */
  @ApiModelProperty(value = "手机")
  private String phone;

    /**
     * 生日
     */
  @ApiModelProperty(value = "生日")
  private LocalDateTime birthday;

    /**
     * 性别
     */
  @ApiModelProperty(value = "性别")
  private Integer sex;

    /**
     * 角色id
     */
  @ApiModelProperty(value = "角色id")
  private String roleId;

    /**
     * 部门id
     */
  @ApiModelProperty(value = "部门id")
  private String deptId;

    /**
     * 状态
     */
  @ApiModelProperty(value = "状态")
  private Integer status;



}
