
package org.azhon.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.api.R;
import org.azhon.common.mybaits.base.BaseContoller;
import org.azhon.common.mybaits.support.Condition;
import org.azhon.common.mybaits.support.Query;
import org.azhon.system.entity.Dict;
import org.azhon.system.service.IDictService;
import org.azhon.system.vo.DictVO;
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
 * 文件名:    DictController
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典 控制器
 *
 * @author zjb
 */
@RestController
@AllArgsConstructor
@RequestMapping("/dict")
@Api(value = "字典", tags = "字典接口")
public class DictController extends BaseContoller {

	private IDictService dictService;



	/**
	* 自定义分页 字典
	*/
	@GetMapping("/page")
	@ApiOperation(value = "分页", notes = "传入dict", position = 3)
	public R<IPage<DictVO>> page(DictVO dict, Query query) {
		IPage<DictVO> pages = dictService.selectDictPage(Condition.getPage(query), dict);
		return R.success(pages);
	}

	/**
	* 新增 字典
	*/
	@PostMapping("/save")
	@ApiOperation(value = "新增", notes = "传入dict", position = 4)
	public R save(@Valid @RequestBody Dict dict) {
		return R.status(dictService.save(dict));
	}

	/**
	* 修改 字典
	*/
	@PostMapping("/update")
	@ApiOperation(value = "修改", notes = "传入dict", position = 5)
	public R update(@Valid @RequestBody Dict dict) {
		return R.status(dictService.updateById(dict));
	}

	/**
	* 新增或修改 字典
	*/
	@PostMapping("/submit")
	@ApiOperation(value = "新增或修改", notes = "传入dict", position = 6)
	public R submit(@Valid @RequestBody Dict dict) {
		return R.status(dictService.saveOrUpdate(dict));
	}
//
//	/**
//	* 删除 字典
//	*/
//	@PostMapping("/remove")
//	@ApiOperation(value = "逻辑删除", notes = "传入id", position = 7)
//	public R remove(@ApiParam(value = "主键", required = true) @RequestParam String id) {
//		return R.status(dictService.deleteLogic(Integer.parseInt(id)));
//	}



}
