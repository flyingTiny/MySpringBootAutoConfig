package com.xcy.config.foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-20 16:05
 * @Version 1.0
 */
//@Import(BarConfig.class)
@Configuration
public class FooConfig {
    public FooConfig() {
        System.out.println("construct FooConfig");
    }

    @Bean
    public Foo foo(){
        System.out.println("foo()");
        return new Foo();
    }
}
