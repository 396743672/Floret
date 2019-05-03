
package org.azhon.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.azhon.system.entity.Menu;
import org.azhon.system.mapper.MenuMapper;
import org.azhon.system.service.IMenuService;
import org.azhon.system.vo.MenuVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.system.service.impl
 * 文件名:   MenuServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单 服务实现类
 *
 * @author zjb
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

	@Override
	public IPage<MenuVO> selectMenuPage(IPage<MenuVO> page, MenuVO menu) {
		return page.setRecords(baseMapper.selectMenuPage(page, menu));
	}

}
