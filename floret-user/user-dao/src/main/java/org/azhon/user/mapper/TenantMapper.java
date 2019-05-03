
package org.azhon.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.user.entity.Tenant;
import org.azhon.user.vo.TenantVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.user.mapper
 * 文件名:   TenantMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO  Mapper 接口
 *
 * @author zjb
 */
public interface TenantMapper extends BaseMapper<Tenant> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param tenant
	 * @return
	 */
	List<TenantVO> selectTenantPage(IPage page, TenantVO tenant);

}
