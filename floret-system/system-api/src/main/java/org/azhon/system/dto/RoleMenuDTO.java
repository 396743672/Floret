package org.azhon.system.dto;

import org.azhon.system.entity.RoleMenu;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 包名      org.azhon.system.dto
 * 文件名:   RoleMenuDTO
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单数据传输对象实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleMenuDTO extends RoleMenu {
	private static final long serialVersionUID = 1L;

}
