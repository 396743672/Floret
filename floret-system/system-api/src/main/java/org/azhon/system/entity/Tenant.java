
package org.azhon.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import org.azhon.common.mybaits.base.BaseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 包名       org.azhon.system.entity
 * 文件名:    Tenant
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户实体类
 *
 * @author zjb
 */
@Data
@TableName("floret_tenant")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Tenant对象", description = "多租户")
public class Tenant extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 租户编号
     */
  @ApiModelProperty(value = "租户编号")
  private String tenantCode;

    /**
     * 租户名称
     */
  @ApiModelProperty(value = "租户名称")
  private String tenantName;

    /**
     * 联系人
     */
  @ApiModelProperty(value = "联系人")
  private String linkman;

    /**
     * 联系电话
     */
  @ApiModelProperty(value = "联系电话")
  private String contactNumber;

    /**
     * 联系地址
     */
  @ApiModelProperty(value = "联系地址")
  private String address;

    /**
     * 状态
     */
  @ApiModelProperty(value = "状态")
  private Integer status;



}
