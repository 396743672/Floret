
package org.azhon.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.system.entity.Dept;
import org.azhon.system.vo.DeptVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.system.mapper
 * 文件名:   DeptMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 部门 Mapper 接口
 *
 * @author zjb
 */
public interface DeptMapper extends BaseMapper<Dept> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param dept
	 * @return
	 */
	List<DeptVO> selectDeptPage(IPage page, DeptVO dept);

}
