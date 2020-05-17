package com.yanzhen.annotation.config;

import com.yanzhen.annotation.bean.Yellow;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    //AnnotationMetadata  : 标注import注解这个类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.yanzhen.annotation.bean.Yellow","com.yanzhen.annotation.bean.Blue"};
    }
}
