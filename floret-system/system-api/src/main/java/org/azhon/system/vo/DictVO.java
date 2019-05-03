
package org.azhon.system.vo;

import org.azhon.system.entity.Dict;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.system.vo;
 * 文件名:   DictVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 字典视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "DictVO对象", description = "字典")
public class DictVO extends Dict {
	private static final long serialVersionUID = 1L;

}
