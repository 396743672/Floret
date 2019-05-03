
package org.azhon.user.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.api.R;
import org.azhon.common.mybaits.base.BaseContoller;
import org.azhon.common.mybaits.support.Condition;
import org.azhon.common.mybaits.support.Query;
import org.azhon.user.entity.Tenant;
import org.azhon.user.service.ITenantService;
import org.azhon.user.vo.TenantVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;

/**
 * 包名       org.azhon.user.controller
 * 文件名:    TenantController
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户 控制器
 *
 * @author zjb
 */
@RestController
@AllArgsConstructor
@RequestMapping("/tenant")
@Api(value = "多租户", tags = "多租户接口")
public class TenantController extends BaseContoller {

	private ITenantService tenantService;



	/**
	* 自定义分页 多租户
	*/
	@GetMapping("/page")
	@ApiOperation(value = "分页", notes = "传入tenant", position = 3)
	public R<IPage<TenantVO>> page(TenantVO tenant, Query query) {
		IPage<TenantVO> pages = tenantService.selectTenantPage(Condition.getPage(query), tenant);
		return R.success(pages);
	}

	/**
	* 新增 多租户
	*/
	@PostMapping("/save")
	@ApiOperation(value = "新增", notes = "传入tenant", position = 4)
	public R save(@Valid @RequestBody Tenant tenant) {
		return R.status(tenantService.save(tenant));
	}

	/**
	* 修改 多租户
	*/
	@PostMapping("/update")
	@ApiOperation(value = "修改", notes = "传入tenant", position = 5)
	public R update(@Valid @RequestBody Tenant tenant) {
		return R.status(tenantService.updateById(tenant));
	}

	/**
	* 新增或修改 多租户
	*/
	@PostMapping("/submit")
	@ApiOperation(value = "新增或修改", notes = "传入tenant", position = 6)
	public R submit(@Valid @RequestBody Tenant tenant) {
		return R.status(tenantService.saveOrUpdate(tenant));
	}

	/**
	* 删除 多租户
	*/
	@PostMapping("/remove")
	@ApiOperation(value = "逻辑删除", notes = "传入id", position = 7)
	public R remove(@ApiParam(value = "主键", required = true) @RequestParam String id) {
		return R.status(tenantService.deleteLogic(Integer.parseInt(id)));
	}



}
