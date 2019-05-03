package org.azhon.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 项目名:    Floret
 * 包名       org.azhon.auth
 * 文件名:    AuthApplication
 * 创建时间:  2019-04-30 on 18:00
 * 描述:     TODO
 *
 * @author ZJB
 */
@EnableFeignClients
@SpringCloudApplication
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
