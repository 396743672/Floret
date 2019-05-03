
package org.azhon.user.wrapper;

import org.azhon.common.mybaits.support.BaseEntityWrapper;
import org.azhon.common.utils.BeanUtil;
import org.azhon.user.entity.User;
import org.azhon.user.vo.UserVO;

import lombok.AllArgsConstructor;

/**
 *
 * 包名   org.azhon.user.wrapper
 * 文件名:   UserWrapper
 * 创建时间:  2019-05-03
 * 描述:     TODO 包装类,返回视图层所需的字段
 *
 * @author zjb
 */
@AllArgsConstructor
public class UserWrapper extends BaseEntityWrapper<User, UserVO>  {



	@Override
	public UserVO entityVO(User user) {
		UserVO userVO = BeanUtil.copy(user, UserVO.class);
		return userVO;
	}

}
