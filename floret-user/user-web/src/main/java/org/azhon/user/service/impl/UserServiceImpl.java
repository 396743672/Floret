
package org.azhon.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.mybaits.base.BaseServiceImpl;
import org.azhon.user.entity.User;
import org.azhon.user.entity.UserDetail;
import org.azhon.user.mapper.UserMapper;
import org.azhon.user.service.IUserService;
import org.azhon.user.vo.UserVO;
import org.springframework.stereotype.Service;

/**
 *
 * 包名   org.azhon.user.service.impl
 * 文件名:   UserServiceImpl
 * 创建时间:  2019-05-03
 * 描述:     TODO 用户表 服务实现类
 *
 * @author zjb
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public IPage<UserVO> selectUserPage(IPage<UserVO> page, UserVO user) {
		return page.setRecords(baseMapper.selectUserPage(page, user));
	}

	@Override
	public UserDetail userDetail(String tenantCode, String account, String password) {
		return null;
	}

}
