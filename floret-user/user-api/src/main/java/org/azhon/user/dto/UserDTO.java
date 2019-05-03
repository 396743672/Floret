package org.azhon.user.dto;

import org.azhon.user.entity.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 包名      org.azhon.user.dto
 * 文件名:   UserDTO
 * 创建时间:  2019-05-03
 * 描述:     TODO 数据传输对象实体类
 *
 * @author zjb
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends User {
	private static final long serialVersionUID = 1L;

}
