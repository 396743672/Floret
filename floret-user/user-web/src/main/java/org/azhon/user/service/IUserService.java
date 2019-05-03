
package org.azhon.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.mybaits.base.BaseService;
import org.azhon.user.entity.User;
import org.azhon.user.vo.UserVO;

/**
 *
 * 包名   org.azhon.user.service
 * 文件名:   IUserService
 * 创建时间:  2019-05-03
 * 描述:     TODO 用户表 服务类
 *
 * @author zjb
 */

public interface IUserService extends BaseService<User> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param user
	 * @return
	 */
	IPage<UserVO> selectUserPage(IPage<UserVO> page, UserVO user);

}
