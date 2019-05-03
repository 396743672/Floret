
package org.azhon.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import org.azhon.system.entity.RoleMenu;
import org.azhon.system.vo.RoleMenuVO;

/**
 *
 * 包名   org.azhon.system.service
 * 文件名:   IRoleMenuService
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单 服务类
 *
 * @author zjb
 */

public interface IRoleMenuService extends IService<RoleMenu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param roleMenu
	 * @return
	 */
	IPage<RoleMenuVO> selectRoleMenuPage(IPage<RoleMenuVO> page, RoleMenuVO roleMenu);

}
