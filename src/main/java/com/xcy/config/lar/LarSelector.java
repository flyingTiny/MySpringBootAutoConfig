package com.xcy.config.lar;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-20 16:34
 * @Version 1.0
 */
public class LarSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Lar.class.getName()};
    }
}
