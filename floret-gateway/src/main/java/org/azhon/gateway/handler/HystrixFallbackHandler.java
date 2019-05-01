package org.azhon.gateway.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;


/**
 * 项目名:    Floret
 * 包名       org.azhon.gateway.handler
 * 文件名:    HystrixFallbackHandler
 * 创建时间:  2019-05-01 on 14:19
 * 描述:     TODO Hystrix 降级处理
 *
 * @author ZJB
 */
@Slf4j
@Component
public class HystrixFallbackHandler implements HandlerFunction<ServerResponse> {
    @Override
    public Mono<ServerResponse> handle(ServerRequest serverRequest) {
        log.error("网关执行请求:{}失败,hystrix服务降级处理", serverRequest.uri());
        return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromObject("服务异常"));
    }

}
