
package org.azhon.system.vo;

import org.azhon.system.entity.Menu;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.system.vo;
 * 文件名:   MenuVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 菜单视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "MenuVO对象", description = "菜单")
public class MenuVO extends Menu {
	private static final long serialVersionUID = 1L;

}
