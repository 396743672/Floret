
package org.azhon.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.system.entity.Menu;
import org.azhon.system.vo.MenuVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.system.mapper
 * 文件名:   MenuMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单 Mapper 接口
 *
 * @author zjb
 */
public interface MenuMapper extends BaseMapper<Menu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param menu
	 * @return
	 */
	List<MenuVO> selectMenuPage(IPage page, MenuVO menu);

}
