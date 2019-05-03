
package org.azhon.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import org.azhon.system.entity.Dict;
import org.azhon.system.vo.DictVO;

/**
 *
 * 包名   org.azhon.system.service
 * 文件名:   IDictService
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典 服务类
 *
 * @author zjb
 */

public interface IDictService extends IService<Dict> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param dict
	 * @return
	 */
	IPage<DictVO> selectDictPage(IPage<DictVO> page, DictVO dict);

}
