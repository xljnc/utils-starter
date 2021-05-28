package com.wt.rocketmq.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author qiyu
 * @date 2021/5/28
 */
@ConfigurationProperties(prefix = "rocketmq.custom")
@EnableConfigurationProperties
@Component
public class RocketMQCustomConfigProperties {

    /**
     * 是否启用消息防重复过滤
     */
    private boolean enableMessageDuplicateFilter;

    public boolean isEnableMessageDuplicateFilter() {
        return enableMessageDuplicateFilter;
    }

    public void setEnableMessageDuplicateFilter(boolean enableMessageDuplicateFilter) {
        this.enableMessageDuplicateFilter = enableMessageDuplicateFilter;
    }
}
