
package org.azhon.system.vo;

import org.azhon.system.entity.Tenant;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.system.vo;
 * 文件名:   TenantVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "TenantVO对象", description = "多租户")
public class TenantVO extends Tenant {
	private static final long serialVersionUID = 1L;

}
