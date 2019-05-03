
package org.azhon.system.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.system.entity.Role;
import org.azhon.system.vo.RoleVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.system.wrapper
 * 文件名:   RoleWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class RoleWrapper extends BaseEntityWrapper<Role, RoleVO>  {



	@Override
	public RoleVO entityVO(Role role) {
		RoleVO roleVO = BeanUtil.copy(role, RoleVO.class);
		return roleVO;
	}

}
