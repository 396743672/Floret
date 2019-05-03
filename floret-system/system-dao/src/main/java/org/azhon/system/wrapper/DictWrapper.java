
package org.azhon.system.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.system.entity.Dict;
import org.azhon.system.vo.DictVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.system.wrapper
 * 文件名:   DictWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class DictWrapper extends BaseEntityWrapper<Dict, DictVO>  {



	@Override
	public DictVO entityVO(Dict dict) {
		DictVO dictVO = BeanUtil.copy(dict, DictVO.class);
		return dictVO;
	}

}
