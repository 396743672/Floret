
package org.azhon.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import org.azhon.system.entity.Menu;
import org.azhon.system.vo.MenuVO;

/**
 *
 * 包名   org.azhon.system.service
 * 文件名:   IMenuService
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单 服务类
 *
 * @author zjb
 */

public interface IMenuService extends IService<Menu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param menu
	 * @return
	 */
	IPage<MenuVO> selectMenuPage(IPage<MenuVO> page, MenuVO menu);

}
