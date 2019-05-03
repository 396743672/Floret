
package org.azhon.system.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.system.entity.Menu;
import org.azhon.system.vo.MenuVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.system.wrapper
 * 文件名:   MenuWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class MenuWrapper extends BaseEntityWrapper<Menu, MenuVO>  {



	@Override
	public MenuVO entityVO(Menu menu) {
		MenuVO menuVO = BeanUtil.copy(menu, MenuVO.class);
		return menuVO;
	}

}
