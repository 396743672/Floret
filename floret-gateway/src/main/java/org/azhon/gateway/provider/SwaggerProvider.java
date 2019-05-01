package org.azhon.gateway.provider;


import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.support.NameUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


/**
 * 项目名:    Floret
 * 包名       org.azhon.gateway.provider
 * 文件名:    SwaggerProvider
 * 创建时间:  2019-05-01 on 14:19
 * 描述:     TODO 聚合接口文档注册
 *
 * @author ZJB
 */
@Primary
@Component
@AllArgsConstructor
public class SwaggerProvider implements SwaggerResourcesProvider {
    public static final String API_URI = "/v2/api-docs-ext";
    private final RouteLocator routeLocator;
    private final GatewayProperties gatewayProperties;

    private static Map<String, String> routeMap = new HashMap<>();

    static {
        routeMap.put("xietong", "协同服务");
        routeMap.put("qr", "资质备案服务");
        routeMap.put("hg", "合规服务");
        routeMap.put("gps-web", "gps服务");
        routeMap.put("gps-netty", "gps809");
        routeMap.put("approval", "审核服务");
        routeMap.put("gate", "抬杠服务");
        routeMap.put("logink", "省平台服务");
        routeMap.put("zd-xt", "协同服务(新)");
    }

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        List<String> routes = new ArrayList<>();
        routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
        gatewayProperties.getRoutes().stream().filter(routeDefinition -> routes.contains(routeDefinition.getId())).forEach(routeDefinition -> routeDefinition.getPredicates().stream()
                .filter(predicateDefinition -> "Path".equalsIgnoreCase(predicateDefinition.getName()))
                .forEach(predicateDefinition -> {
                    resources.add(SwaggerProvider.this.swaggerResource(routeDefinition.getId(),
                            predicateDefinition.getArgs().get(NameUtils.GENERATED_NAME_PREFIX + "0")
                                    .replace("/**", API_URI)));
                }));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName((routeMap.get(name) == null ? name : routeMap.get(name)));
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }

}
