
package org.azhon.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.user.entity.User;
import org.azhon.user.vo.UserVO;

import java.util.List;

/**
 *
 * 包名   org.azhon.user.mapper
 * 文件名:   UserMapper
 * 创建时间:  2019-05-03
 * 描述:     TODO  Mapper 接口
 *
 * @author zjb
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param user
	 * @return
	 */
	List<UserVO> selectUserPage(IPage page, UserVO user);

}
