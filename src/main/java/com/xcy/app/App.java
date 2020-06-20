package com.xcy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-19 20:31
 * @Version 1.0
 */
//@AutoConfigurationPackage 当没手动指定时 the package of the annotated class is registered.
//@EnableLar
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(App.class);
//        ac.getBean(Lar.class);
    }
}
