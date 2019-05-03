
package org.azhon.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import org.azhon.system.entity.Dept;
import org.azhon.system.vo.DeptVO;

/**
 *
 * 包名   org.azhon.system.service
 * 文件名:   IDeptService
 * 创建时间:  2019-05-03
 * 描述:     TODO 部门 服务类
 *
 * @author zjb
 */

public interface IDeptService extends IService<Dept> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param dept
	 * @return
	 */
	IPage<DeptVO> selectDeptPage(IPage<DeptVO> page, DeptVO dept);

}
