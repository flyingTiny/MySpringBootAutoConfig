package com.xcy.app.ha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-20 17:06
 * @Version 1.0
 */
@Configuration
public class HaConfig {
    @Bean
    public Ha ha(){
        return new Ha();
    }
}
