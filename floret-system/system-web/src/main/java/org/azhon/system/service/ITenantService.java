
package org.azhon.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.mybaits.base.BaseService;
import org.azhon.system.entity.Tenant;
import org.azhon.system.vo.TenantVO;

/**
 *
 * 包名   org.azhon.system.service
 * 文件名:   ITenantService
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户 服务类
 *
 * @author zjb
 */

public interface ITenantService extends BaseService<Tenant> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param tenant
	 * @return
	 */
	IPage<TenantVO> selectTenantPage(IPage<TenantVO> page, TenantVO tenant);

}
