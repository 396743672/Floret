
package org.azhon.system.vo;

import org.azhon.system.entity.RoleMenu;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.system.vo;
 * 文件名:   RoleMenuVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "RoleMenuVO对象", description = "权限-菜单")
public class RoleMenuVO extends RoleMenu {
	private static final long serialVersionUID = 1L;

}
