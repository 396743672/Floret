package org.azhon.user.fegin;

import org.azhon.common.api.R;
import org.azhon.user.entity.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 项目名:    Floret
 * 包名       org.azhon.user.fegin
 * 文件名:    UserClient
 * 创建时间:  2019-05-03 on 14:26
 * 描述:     TODO
 *
 * @author ZJB
 */
@FeignClient(value = "floret-user")
public interface UserClient {
    /**
     * 获取用户信息
     *
     * @param tenantCode     租户编号
     * @param account  账号
     * @param password 密码
     * @return
     */
    @GetMapping("/user-detail")
    R<UserDetail> userInfo(@RequestParam("tenantCode") String tenantCode, @RequestParam("account") String account, @RequestParam("password") String password);

}
