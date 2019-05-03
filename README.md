<p align="center"><img width="512" src="logo.png"></p>

<p align="center">
  <a href="https://github.com/vuejs/vue">
    <img src="https://img.shields.io/badge/vue-2.5.17-brightgreen.svg" alt="vue">
  </a>
  <a href="https://github.com/ElemeFE/element">
    <img src="https://img.shields.io/badge/iview-3.2.2-brightgreen.svg" alt="element-ui">
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img src="https://img.shields.io/badge/spring--boot-2.0.8.RELEASE-blue.svg" alt="spring-boot">
  </a>
  <a href="https://spring.io/projects/spring-cloud">
    <img src="https://img.shields.io/badge/spring--cloud-Finchley.SR2-blue.svg" alt="spring-cloud">
  </a>
  <a >
    <img src="https://img.shields.io/badge/license-Apache%202.0-green.svg" alt="license">
  </a>
</p>



# Floret

- 前后端完全分离，基于最新稳定版本`Spring Boot 2.0.8.RELEASE`
- 基于网关聚合API文档
- 基于`Spring Security OAuth`实现按钮级细粒度权限控制


# 项目介绍

Floret一个基于Spring Cloud的基础微服务开发框架。

项目使用Maven进行管理，结构如下：

``` lua
Floret
├── floret-common  --  公共组件
├────├──common-core -- 公共模块
     ├──common-core-mybatis   -- 公共数据库模块Mybatis-plus
     ├──common-core-security   -- 公共安全模块
     ├──common-core-swagger   -- 公共接口文档模块
     ├──common-core-cloud   -- 公共外部调用基础封装
├── floret-generator -- 代码生成
├── floret-gateway -- 网关文档聚合（端口：8888）
├── floret-auth -- 认证中心（端口：8001）
├── floret-system -- 系统模块（端口：8002）
├── floret-user -- 用户模块（端口：8003）

```

前端项目链接：正在开发...

- 用户管理：完整的用户管理授权体系
- 部门管理：配置系统组织机构，树结构展现，可随意调整上下级
- 菜单管理：配置系统菜单，操作权限，按钮权限标识，图标等
- 角色管理：角色菜单权限分配，最新的基于资源的权限控制（new RBAC）

## 软件架构

#### 后端技术选型

| 名称                  | 版本           | 说明         | 官网                                                         |
| --------------------- | -------------- | ------------ | ------------------------------------------------------------ |
| JDK                   | 1.8.0_161      | 运行环境     | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Maven                 | 3.5.2          | 项目构建管理 | http://maven.apache.org                                      |
| Spring-boot           | 2.0.8.RELEASE1 | 微服务框架   | https://spring.io/projects/spring-boot                       |
| Spring-cloud          | Finchley.SR2   | 微服务框架   | https://spring.io/projects/spring-cloud                      |
| Nacos                 | v1.0.0         | 服务发现     | https://nacos.io/zh-cn/index.html                         |
| gatway                |                | 网关         | https://github.com/spring-cloud/spring-cloud-netflix         |
| MySQL                 | 5.7.16         | 数据库       | https://www.mysql.com/downloads/                             |
| MyBatis               |                | ORM框架      | http://blog.mybatis.org/                                     |
| MyBatis-plus          |                | mybaitis框架 | http://blog.mybatis.org/                                     |
| Swagger-Bootstrap-UI  | 1.9.2          | 文档         | https://gitee.com/xiaoym/swagger-bootstrap-ui                |
| Spring Security OAuth |                | 安全框架     | https://spring.io/projects/spring-security-oauth             |
| Hystrix               |                | 熔断器       | https://github.com/spring-cloud/spring-cloud-netflix         |
| Ribbon                |                | 负载均衡     | https://github.com/spring-cloud/spring-cloud-netflix         |

#### 前端技术选型

| 名称               | 版本   | 说明         | 官网                                            |
| ------------------ | ------ | ------------ | ----------------------------------------------- |
| vue                | 2.5.17 | 前端框架     | https://github.com/vuejs/vue                    |
| iview              | 3.2.2  | UI组件       | https://gitee.com/icarusion/iview                     |
| axios              | 0.18.0 | 网络组件     | https://github.com/axios/axios                  |
| vuex               | 3.0.1  | 前端状态管理 | https://github.com/vuejs/vuex                   |
| vue-router         | 3.0.1  | 前端路由     | https://github.com/vuejs/vue-router             |
| iview-admin        |        | 后台模板     | https://gitee.com/icarusion/iview-admin |

# 文档

# 截图


# 关注
