
package org.azhon.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 包名       org.azhon.system.entity
 * 文件名:    Role
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表实体类
 *
 * @author zjb
 */
@Data
@TableName("floret_role")
@ApiModel(value = "Role对象", description = "权限表")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
  @ApiModelProperty(value = "主键")
  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;

    /**
     * 租户编号
     */
  @ApiModelProperty(value = "租户编号")
  private String tenantCode;

    /**
     * 父主键
     */
  @ApiModelProperty(value = "父主键")
  private Integer parentId;

    /**
     * 角色名
     */
  @ApiModelProperty(value = "角色名")
  private String roleName;

    /**
     * 排序
     */
  @ApiModelProperty(value = "排序")
  private Integer sort;

    /**
     * 角色别名
     */
  @ApiModelProperty(value = "角色别名")
  private String roleAlias;

    /**
     * 是否已删除
     */
  @ApiModelProperty(value = "是否已删除")
  private Integer isDeleted;



}
