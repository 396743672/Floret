package org.azhon.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 项目名:    Floret
 * 包名       org.azhon.system
 * 文件名:    SystemApplication
 * 创建时间:  2019-04-30 on 18:15
 * 描述:     TODO
 *
 * @author ZJB
 */
@SpringCloudApplication
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
