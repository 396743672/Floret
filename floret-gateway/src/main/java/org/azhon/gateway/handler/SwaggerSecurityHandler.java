package org.azhon.gateway.handler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;



/**
 * 项目名:    Floret
 * 包名       org.azhon.gateway.handler
 * 文件名:    SwaggerSecurityHandler
 * 创建时间:  2019-05-01 on 14:19
 * 描述:     TODO SwaggerSecurityHandler
 *
 * @author ZJB
 */
@Slf4j
@Component
public class SwaggerSecurityHandler implements HandlerFunction<ServerResponse> {
    @Autowired(required = false)
    private SecurityConfiguration securityConfiguration;

    /**
     * Handle the given request.
     *
     * @param request the request to handler
     * @return the response
     */
    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        return ServerResponse.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(
                        Optional.ofNullable(securityConfiguration)
                                .orElse(SecurityConfigurationBuilder.builder().build())));
    }
}
