
package org.azhon.system.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.system.entity.RoleMenu;
import org.azhon.system.vo.RoleMenuVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.system.wrapper
 * 文件名:   RoleMenuWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class RoleMenuWrapper extends BaseEntityWrapper<RoleMenu, RoleMenuVO>  {



	@Override
	public RoleMenuVO entityVO(RoleMenu roleMenu) {
		RoleMenuVO roleMenuVO = BeanUtil.copy(roleMenu, RoleMenuVO.class);
		return roleMenuVO;
	}

}
