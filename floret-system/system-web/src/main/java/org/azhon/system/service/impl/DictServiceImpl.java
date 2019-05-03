
package org.azhon.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.azhon.system.entity.Dict;
import org.azhon.system.mapper.DictMapper;
import org.azhon.system.service.IDictService;
import org.azhon.system.vo.DictVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.system.service.impl
 * 文件名:   DictServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典 服务实现类
 *
 * @author zjb
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

	@Override
	public IPage<DictVO> selectDictPage(IPage<DictVO> page, DictVO dict) {
		return page.setRecords(baseMapper.selectDictPage(page, dict));
	}

}
