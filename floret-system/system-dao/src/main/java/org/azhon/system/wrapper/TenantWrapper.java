
package org.azhon.system.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.system.entity.Tenant;
import org.azhon.system.vo.TenantVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.system.wrapper
 * 文件名:   TenantWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 多租户包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class TenantWrapper extends BaseEntityWrapper<Tenant, TenantVO>  {



	@Override
	public TenantVO entityVO(Tenant tenant) {
		TenantVO tenantVO = BeanUtil.copy(tenant, TenantVO.class);
		return tenantVO;
	}

}
