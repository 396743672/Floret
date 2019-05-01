package org.azhon.gateway.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


/**
 * 项目名:    Floret
 * 包名       org.azhon.gateway.handler
 * 文件名:    SwaggerResourceHandler
 * 创建时间:  2019-05-01 on 14:19
 * 描述:     TODO SwaggerResourceHandler
 *
 * @author ZJB
 */
@Slf4j
@Component
@AllArgsConstructor
public class SwaggerResourceHandler implements HandlerFunction<ServerResponse> {
	private final SwaggerResourcesProvider swaggerResources;

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
			.body(BodyInserters.fromObject(swaggerResources.get()));
	}

}
