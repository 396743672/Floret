
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
 * 文件名:    Menu
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单实体类
 *
 * @author zjb
 */
@Data
@TableName("floret_menu")
@ApiModel(value = "Menu对象", description = "菜单")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
  @ApiModelProperty(value = "主键")
  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;

    /**
     * 父级菜单
     */
  @ApiModelProperty(value = "父级菜单")
  private Integer parentId;

    /**
     * 菜单编号
     */
  @ApiModelProperty(value = "菜单编号")
  private String code;

    /**
     * 菜单名称
     */
  @ApiModelProperty(value = "菜单名称")
  private String name;

    /**
     * 菜单别名
     */
  @ApiModelProperty(value = "菜单别名")
  private String alias;

    /**
     * 请求地址
     */
  @ApiModelProperty(value = "请求地址")
  private String path;

    /**
     * 菜单资源
     */
  @ApiModelProperty(value = "菜单资源")
  private String source;

    /**
     * 排序
     */
  @ApiModelProperty(value = "排序")
  private Integer sort;

    /**
     * 菜单类型
     */
  @ApiModelProperty(value = "菜单类型")
  private Integer category;

    /**
     * 操作按钮类型
     */
  @ApiModelProperty(value = "操作按钮类型")
  private Integer action;

    /**
     * 是否打开新页面
     */
  @ApiModelProperty(value = "是否打开新页面")
  private Integer isOpen;

    /**
     * 备注
     */
  @ApiModelProperty(value = "备注")
  private String remark;

    /**
     * 是否已删除
     */
  @ApiModelProperty(value = "是否已删除")
  private Integer isDeleted;



}
