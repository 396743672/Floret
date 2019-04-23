# Floret

### 项目介绍

#### 项目结构
``` lua
Floret
├── floret-common  --  公共组件
├────├──common-core -- 公共模块
     ├──common-core-mybatis   -- 公共数据库模块Mybatis-plus
     ├──common-core-security   -- 公共redis模块
     ├──common-core-swagger   -- 公共接口文档模块
     ├──common-core-cloud   -- 公共外部调用基础封装
├── floret-gateway -- 网关文档聚合（端口：8888）
├── floret-gps  --  Gps服务相关
├────├──gps-dao -- 公共数据库模块
     ├──gps-api   -- gps微服务外部调用层
     ├──gps-netty  -- 基于netty809协议对接（端口：8098）netty:8088
     ├──gps-web   -- gps数据处理web（端口：8097）

```



