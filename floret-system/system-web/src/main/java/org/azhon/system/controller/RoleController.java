
package org.azhon.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.api.R;
import org.azhon.common.mybaits.base.BaseContoller;
import org.azhon.common.mybaits.support.Condition;
import org.azhon.common.mybaits.support.Query;
import org.azhon.system.entity.Role;
import org.azhon.system.service.IRoleService;
import org.azhon.system.vo.RoleVO;
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
 * 文件名:    RoleController
 * 创建时间:  2019-05-03
 * 描述:     TODO 权限表 控制器
 *
 * @author zjb
 */
@RestController
@AllArgsConstructor
@RequestMapping("/role")
@Api(value = "权限表", tags = "权限表接口")
public class RoleController extends BaseContoller {

	private IRoleService roleService;



	/**
	* 自定义分页 权限表
	*/
	@GetMapping("/page")
	@ApiOperation(value = "分页", notes = "传入role", position = 3)
	public R<IPage<RoleVO>> page(RoleVO role, Query query) {
		IPage<RoleVO> pages = roleService.selectRolePage(Condition.getPage(query), role);
		return R.success(pages);
	}

	/**
	* 新增 权限表
	*/
	@PostMapping("/save")
	@ApiOperation(value = "新增", notes = "传入role", position = 4)
	public R save(@Valid @RequestBody Role role) {
		return R.status(roleService.save(role));
	}

	/**
	* 修改 权限表
	*/
	@PostMapping("/update")
	@ApiOperation(value = "修改", notes = "传入role", position = 5)
	public R update(@Valid @RequestBody Role role) {
		return R.status(roleService.updateById(role));
	}

	/**
	* 新增或修改 权限表
	*/
	@PostMapping("/submit")
	@ApiOperation(value = "新增或修改", notes = "传入role", position = 6)
	public R submit(@Valid @RequestBody Role role) {
		return R.status(roleService.saveOrUpdate(role));
	}

//	/**
//	* 删除 权限表
//	*/
//	@PostMapping("/remove")
//	@ApiOperation(value = "逻辑删除", notes = "传入id", position = 7)
//	public R remove(@ApiParam(value = "主键", required = true) @RequestParam String id) {
//		return R.status(roleService.deleteLogic(Integer.parseInt(id)));
//	}



}
