
package org.azhon.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.system.entity.Role;
import org.azhon.system.vo.RoleVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.system.mapper
 * 文件名:   RoleMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表 Mapper 接口
 *
 * @author zjb
 */
public interface RoleMapper extends BaseMapper<Role> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param role
	 * @return
	 */
	List<RoleVO> selectRolePage(IPage page, RoleVO role);

}
