package org.azhon.common.cloud;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

/**
 * 项目名:    Floret
 * 包名       org.azhon.common.cloud
 * 文件名:    FeignConfiguration
 * 创建时间:  2019-04-23 on 23:33
 * 描述:     TODO WEB配置
 *
 * @author ZJB
 */

@Slf4j
@Configuration
@EnableCaching
@Order(Ordered.HIGHEST_PRECEDENCE)
public class FeignConfiguration implements WebMvcConfigurer {

	@Bean
	public FeignHystrixConcurrencyStrategy feignHystrixConcurrencyStrategy() {
		return new FeignHystrixConcurrencyStrategy();
	}

}
