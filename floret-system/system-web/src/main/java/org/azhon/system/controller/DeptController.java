
package org.azhon.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.api.R;
import org.azhon.common.mybaits.base.BaseContoller;
import org.azhon.common.mybaits.support.Condition;
import org.azhon.common.mybaits.support.Query;
import org.azhon.system.entity.Dept;
import org.azhon.system.service.IDeptService;
import org.azhon.system.vo.DeptVO;
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
 * 文件名:    DeptController
 * 创建时间:  2019-05-03
 * 描述:     TODO 部门 控制器
 *
 * @author zjb
 */
@RestController
@AllArgsConstructor
@RequestMapping("/dept")
@Api(value = "部门", tags = "部门接口")
public class DeptController extends BaseContoller {

	private IDeptService deptService;



	/**
	* 自定义分页 部门
	*/
	@GetMapping("/page")
	@ApiOperation(value = "分页", notes = "传入dept", position = 3)
	public R<IPage<DeptVO>> page(DeptVO dept, Query query) {
		IPage<DeptVO> pages = deptService.selectDeptPage(Condition.getPage(query), dept);
		return R.success(pages);
	}

	/**
	* 新增 部门
	*/
	@PostMapping("/save")
	@ApiOperation(value = "新增", notes = "传入dept", position = 4)
	public R save(@Valid @RequestBody Dept dept) {
		return R.status(deptService.save(dept));
	}

	/**
	* 修改 部门
	*/
	@PostMapping("/update")
	@ApiOperation(value = "修改", notes = "传入dept", position = 5)
	public R update(@Valid @RequestBody Dept dept) {
		return R.status(deptService.updateById(dept));
	}

	/**
	* 新增或修改 部门
	*/
	@PostMapping("/submit")
	@ApiOperation(value = "新增或修改", notes = "传入dept", position = 6)
	public R submit(@Valid @RequestBody Dept dept) {
		return R.status(deptService.saveOrUpdate(dept));
	}

//	/**
//	* 删除 部门
//	*/
//	@PostMapping("/remove")
//	@ApiOperation(value = "逻辑删除", notes = "传入id", position = 7)
//	public R remove(@ApiParam(value = "主键", required = true) @RequestParam String id) {
//		return R.status(deptService.deleteLogic(Integer.parseInt(id)));
//	}



}
