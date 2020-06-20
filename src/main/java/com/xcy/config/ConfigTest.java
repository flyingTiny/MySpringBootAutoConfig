package com.xcy.config;


import com.xcy.config.bar.Bar;
import com.xcy.config.foo.Foo;
import com.xcy.config.foo.FooConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-20 16:08
 * @Version 1.0
 */
public class ConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FooConfig.class);
        Foo bean = ac.getBean(Foo.class);
        Foo foo = ac.getBean(FooConfig.class).foo();
        System.out.println(bean == foo);

        ac.getBean(Bar.class);
    }
}
