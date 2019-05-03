
package org.azhon.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.azhon.system.entity.Dept;
import org.azhon.system.mapper.DeptMapper;
import org.azhon.system.service.IDeptService;
import org.azhon.system.vo.DeptVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.system.service.impl
 * 文件名:   DeptServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 部门 服务实现类
 *
 * @author zjb
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

	@Override
	public IPage<DeptVO> selectDeptPage(IPage<DeptVO> page, DeptVO dept) {
		return page.setRecords(baseMapper.selectDeptPage(page, dept));
	}

}
