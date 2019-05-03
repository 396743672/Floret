
package org.azhon.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.mybaits.base.BaseServiceImpl;
import org.azhon.system.entity.Tenant;
import org.azhon.system.mapper.TenantMapper;
import org.azhon.system.service.ITenantService;
import org.azhon.system.vo.TenantVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.system.service.impl
 * 文件名:   TenantServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户 服务实现类
 *
 * @author zjb
 */
@Service
public class TenantServiceImpl extends BaseServiceImpl<TenantMapper, Tenant> implements ITenantService {

	@Override
	public IPage<TenantVO> selectTenantPage(IPage<TenantVO> page, TenantVO tenant) {
		return page.setRecords(baseMapper.selectTenantPage(page, tenant));
	}

}
