package org.azhon.common.boot.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;


/**
 * 项目名:    Floret
 * 包名       org.azhon.common.boot.props
 * 文件名:    AsyncProperties
 * 创建时间:  2019-04-23 on 23:51
 * 描述:     TODO 异步线程池配置类
 *
 * @author ZJB
 */
@Getter
@Setter
@ConfigurationProperties("azhon.async")
public class AsyncProperties {
    /**
     * 异步核心线程数，默认：2
     */
    private int corePoolSize = 2;
    /**
     * 异步最大线程数，默认：50
     */
    private int maxPoolSize = 50;
    /**
     * 队列容量，默认：10000
     */
    private int queueCapacity = 10000;
    /**
     * 线程存活时间，默认：300
     */
    private int keepAliveSeconds = 300;
}
