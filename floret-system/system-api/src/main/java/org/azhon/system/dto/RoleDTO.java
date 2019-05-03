package org.azhon.system.dto;

import org.azhon.system.entity.Role;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 包名      org.azhon.system.dto
 * 文件名:   RoleDTO
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表数据传输对象实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDTO extends Role {
	private static final long serialVersionUID = 1L;

}
