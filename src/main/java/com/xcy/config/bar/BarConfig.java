package com.xcy.config.bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-20 16:06
 * @Version 1.0
 */
@Configuration
public class BarConfig {
    public BarConfig() {
        System.out.println("construct BarConfig");
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }
}
