
package org.azhon.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.azhon.system.entity.RoleMenu;
import org.azhon.system.mapper.RoleMenuMapper;
import org.azhon.system.service.IRoleMenuService;
import org.azhon.system.vo.RoleMenuVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.system.service.impl
 * 文件名:   RoleMenuServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单 服务实现类
 *
 * @author zjb
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

	@Override
	public IPage<RoleMenuVO> selectRoleMenuPage(IPage<RoleMenuVO> page, RoleMenuVO roleMenu) {
		return page.setRecords(baseMapper.selectRoleMenuPage(page, roleMenu));
	}

}
