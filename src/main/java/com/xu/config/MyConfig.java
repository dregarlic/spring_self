package com.xu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ConfigBean getMyConfigBean () {
        return new ConfigBean();
    }
}
