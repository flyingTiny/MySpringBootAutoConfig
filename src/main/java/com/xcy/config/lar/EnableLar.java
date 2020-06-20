package com.xcy.config.lar;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-20 16:40
 * @Version 1.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(LarSelector.class)
public @interface EnableLar {
}
