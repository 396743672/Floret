package org.azhon.common.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * 项目名:    Floret
 * 包名       org.azhon.common.swagger
 * 文件名:    SwaggerProperties
 * 创建时间:  2019-04-23 on 23:14
 * 描述:     TODO swagger配置
 *
 * @author zjb
 */
@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties {
    /**
     * swagger会解析的包路径
     **/
    private String basePackage = "org.azhon";
    /**
     * swagger会解析的url规则
     **/
    private List<String> basePath = new ArrayList<>();
    /**
     * 在basePath基础上需要排除的url规则
     **/
    private List<String> excludePath = new ArrayList<>();
    /**
     * 标题
     **/
    private String title = "Floret 接口文档系统";
    /**
     * 描述
     **/
    private String description = "Floret 接口文档系统";
    /**
     * 版本
     **/
    private String version = "1.0.0";
    /**
     * 许可证
     **/
    private String license = "";
    /**
     * 许可证URL
     **/
    private String licenseUrl = "";
    /**
     * 服务条款URL
     **/
    private String termsOfServiceUrl = "";

    /**
     * host信息
     **/
    private String host = "";
    /**
     * 联系人信息
     */
    private Contact contact = new Contact();


    @Data
    @NoArgsConstructor
    public static class Contact {

        /**
         * 联系人
         **/
        private String name = "azhon";
        /**
         * 联系人url
         **/
        private String url = "";
        /**
         * 联系人email
         **/
        private String email = "957250254@qq.com";

    }


}
