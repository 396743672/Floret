
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
 * 文件名:    RoleMenu
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单实体类
 *
 * @author zjb
 */
@Data
@TableName("floret_role_menu")
@ApiModel(value = "RoleMenu对象", description = "权限-菜单")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
  @ApiModelProperty(value = "主键")
  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;

    /**
     * 菜单id
     */
  @ApiModelProperty(value = "菜单id")
  private Integer menuId;

    /**
     * 角色id
     */
  @ApiModelProperty(value = "角色id")
  private Integer roleId;



}
