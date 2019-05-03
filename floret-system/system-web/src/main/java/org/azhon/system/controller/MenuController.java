
package org.azhon.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.api.R;
import org.azhon.common.mybaits.base.BaseContoller;
import org.azhon.common.mybaits.support.Condition;
import org.azhon.common.mybaits.support.Query;
import org.azhon.system.entity.Menu;
import org.azhon.system.service.IMenuService;
import org.azhon.system.vo.MenuVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

/**
 * 包名       org.azhon.system.controller
 * 文件名:    MenuController
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单 控制器
 *
 * @author zjb
 */
@RestController
@AllArgsConstructor
@RequestMapping("/menu")
@Api(value = "菜单", tags = "菜单接口")
public class MenuController extends BaseContoller {

	private IMenuService menuService;



	/**
	* 自定义分页 菜单
	*/
	@GetMapping("/page")
	@ApiOperation(value = "分页", notes = "传入menu", position = 3)
	public R<IPage<MenuVO>> page(MenuVO menu, Query query) {
		IPage<MenuVO> pages = menuService.selectMenuPage(Condition.getPage(query), menu);
		return R.success(pages);
	}

	/**
	* 新增 菜单
	*/
	@PostMapping("/save")
	@ApiOperation(value = "新增", notes = "传入menu", position = 4)
	public R save(@Valid @RequestBody Menu menu) {
		return R.status(menuService.save(menu));
	}

	/**
	* 修改 菜单
	*/
	@PostMapping("/update")
	@ApiOperation(value = "修改", notes = "传入menu", position = 5)
	public R update(@Valid @RequestBody Menu menu) {
		return R.status(menuService.updateById(menu));
	}

	/**
	* 新增或修改 菜单
	*/
	@PostMapping("/submit")
	@ApiOperation(value = "新增或修改", notes = "传入menu", position = 6)
	public R submit(@Valid @RequestBody Menu menu) {
		return R.status(menuService.saveOrUpdate(menu));
	}

//	/**
//	* 删除 菜单
//	*/
//	@PostMapping("/remove")
//	@ApiOperation(value = "逻辑删除", notes = "传入id", position = 7)
//	public R remove(@ApiParam(value = "主键", required = true) @RequestParam String id) {
//		return R.status(menuService.deleteLogic(Integer.parseInt(id)));
//	}



}
