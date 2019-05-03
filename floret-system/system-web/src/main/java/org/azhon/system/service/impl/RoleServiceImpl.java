
package org.azhon.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.azhon.system.entity.Role;
import org.azhon.system.mapper.RoleMapper;
import org.azhon.system.service.IRoleService;
import org.azhon.system.vo.RoleVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.system.service.impl
 * 文件名:   RoleServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表 服务实现类
 *
 * @author zjb
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

	@Override
	public IPage<RoleVO> selectRolePage(IPage<RoleVO> page, RoleVO role) {
		return page.setRecords(baseMapper.selectRolePage(page, role));
	}

}
