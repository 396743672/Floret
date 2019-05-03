
package org.azhon.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.system.entity.RoleMenu;
import org.azhon.system.vo.RoleMenuVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.system.mapper
 * 文件名:   RoleMenuMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限-菜单 Mapper 接口
 *
 * @author zjb
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param roleMenu
	 * @return
	 */
	List<RoleMenuVO> selectRoleMenuPage(IPage page, RoleMenuVO roleMenu);

}
