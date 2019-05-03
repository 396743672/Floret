
package org.azhon.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.system.entity.Dict;
import org.azhon.system.vo.DictVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.system.mapper
 * 文件名:   DictMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典 Mapper 接口
 *
 * @author zjb
 */
public interface DictMapper extends BaseMapper<Dict> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param dict
	 * @return
	 */
	List<DictVO> selectDictPage(IPage page, DictVO dict);

}
