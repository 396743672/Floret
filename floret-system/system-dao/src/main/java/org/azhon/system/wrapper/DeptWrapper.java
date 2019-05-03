
package org.azhon.system.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.system.entity.Dept;
import org.azhon.system.vo.DeptVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.system.wrapper
 * 文件名:   DeptWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 部门包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class DeptWrapper extends BaseEntityWrapper<Dept, DeptVO>  {



	@Override
	public DeptVO entityVO(Dept dept) {
		DeptVO deptVO = BeanUtil.copy(dept, DeptVO.class);
		return deptVO;
	}

}
