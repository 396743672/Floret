
package org.azhon.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import org.azhon.system.entity.Role;
import org.azhon.system.vo.RoleVO;

/**
 *
 * 包名   org.azhon.system.service
 * 文件名:   IRoleService
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表 服务类
 *
 * @author zjb
 */

public interface IRoleService extends IService<Role> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param role
	 * @return
	 */
	IPage<RoleVO> selectRolePage(IPage<RoleVO> page, RoleVO role);

}
