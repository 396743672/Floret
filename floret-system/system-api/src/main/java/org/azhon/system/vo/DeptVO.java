
package org.azhon.system.vo;

import org.azhon.system.entity.Dept;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.system.vo;
 * 文件名:   DeptVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 部门视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "DeptVO对象", description = "部门")
public class DeptVO extends Dept {
	private static final long serialVersionUID = 1L;

}
