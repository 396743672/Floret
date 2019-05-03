
package org.azhon.user.vo;

import org.azhon.user.entity.User;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 包名    org.azhon.user.vo;
 * 文件名:   UserVO
 * 创建时间:  2019-05-03
 * 描述:     TODO 视图实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "UserVO对象", description = "UserVO对象")
public class UserVO extends User {
	private static final long serialVersionUID = 1L;

}
