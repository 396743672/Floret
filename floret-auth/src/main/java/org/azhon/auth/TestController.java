package org.azhon.auth;

import org.azhon.common.api.R;
import org.azhon.common.security.annotation.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 项目名:    Floret
 * 包名       org.azhon.auth
 * 文件名:    TestController
 * 创建时间:  2019-04-24 on 09:39
 * 描述:     TODO
 *
 * @author ZJB
 */
@RestController
@AllArgsConstructor
@RequestMapping("/test")
@Api(value = "测试", tags = "测试")
@Slf4j
public class TestController {


    @GetMapping("/test")
    @ApiOperation(value = "测试", notes = "传入车牌号经纬度")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "test", value = "测试")
    })
    @User("add")
    public R test(String test) {
        return R.success("");
    }
}
