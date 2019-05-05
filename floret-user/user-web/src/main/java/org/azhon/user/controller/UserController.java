
package org.azhon.user.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import org.azhon.common.api.R;
import org.azhon.common.mybaits.base.BaseContoller;
import org.azhon.common.mybaits.support.Condition;
import org.azhon.common.mybaits.support.Query;
import org.azhon.user.entity.User;
import org.azhon.user.entity.UserDetail;
import org.azhon.user.service.IUserService;
import org.azhon.user.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;

/**
 * 包名       org.azhon.user.controller
 * 文件名:    UserController
 * 创建时间:  2019-05-03
 * 描述:     TODO 用户表 控制器
 *
 * @author zjb
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
@Api(value = "用户表", tags = "用户表接口")
public class UserController extends BaseContoller {

    private IUserService userService;


    /**
     * 自定义分页 用户表
     */
    @GetMapping("/page")
    @ApiOperation(value = "分页", notes = "传入user", position = 3)
    public R<IPage<UserVO>> page(UserVO user, Query query) {
        IPage<UserVO> pages = userService.selectUserPage(Condition.getPage(query), user);
        return R.success(pages);
    }

    /**
     * 新增 用户表
     */
    @PostMapping("/save")
    @ApiOperation(value = "新增", notes = "传入user", position = 4)
    public R save(@Valid @RequestBody User user) {
        return R.status(userService.save(user));
    }

    /**
     * 修改 用户表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改", notes = "传入user", position = 5)
    public R update(@Valid @RequestBody User user) {
        return R.status(userService.updateById(user));
    }

    /**
     * 新增或修改 用户表
     */
    @PostMapping("/submit")
    @ApiOperation(value = "新增或修改", notes = "传入user", position = 6)
    public R submit(@Valid @RequestBody User user) {
        return R.status(userService.saveOrUpdate(user));
    }

    /**
     * 删除 用户表
     */
    @PostMapping("/remove")
    @ApiOperation(value = "逻辑删除", notes = "传入id", position = 7)
    public R remove(@ApiParam(value = "主键", required = true) @RequestParam String id) {
        return R.status(userService.deleteLogic(Integer.parseInt(id)));
    }

    /**
     * 获取用户详情
     *
     * @param tenantCode 租户编号
     * @param account    用户名
     * @param password   密码
     * @return
     */
    @GetMapping("/detail")
    public R<UserDetail> userDetail(String tenantCode, String account, String password) {
        return R.success(userService.userDetail(tenantCode, account, password));
    }

}
