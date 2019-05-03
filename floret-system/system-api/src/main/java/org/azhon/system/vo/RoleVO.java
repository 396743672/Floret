
package org.azhon.system.vo;

import org.azhon.system.entity.Role;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.system.vo;
 * 文件名:   RoleVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "RoleVO对象", description = "权限表")
public class RoleVO extends Role {
	private static final long serialVersionUID = 1L;

}
