package org.azhon.common.boot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.interceptor.RetryInterceptorBuilder;
import org.springframework.retry.interceptor.RetryOperationsInterceptor;

import lombok.extern.slf4j.Slf4j;


/**
 * 项目名:    Floret
 * 包名       org.azhon.common.boot.config
 * 文件名:    RetryConfiguration
 * 创建时间:  2019-04-23 on 23:49
 * 描述:     TODO 重试机制
 *
 * @author ZJB
 */
@Slf4j
@Configuration
public class RetryConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "configServerRetryInterceptor")
    public RetryOperationsInterceptor configServerRetryInterceptor() {
        log.info(String.format(
                "configServerRetryInterceptor: Changing backOffOptions " +
                        "to initial: %s, multiplier: %s, maxInterval: %s",
                1000, 1.2, 5000));
        return RetryInterceptorBuilder
                .stateless()
                .backOffOptions(1000, 1.2, 5000)
                .maxAttempts(10)
                .build();
    }

}
