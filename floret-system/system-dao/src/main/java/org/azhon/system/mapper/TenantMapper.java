
package org.azhon.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.system.entity.Tenant;
import org.azhon.system.vo.TenantVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.system.mapper
 * 文件名:   TenantMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户 Mapper 接口
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
