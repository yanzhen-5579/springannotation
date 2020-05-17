package com.yanzhen.annotation.config;

import com.yanzhen.annotation.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean person = beanDefinitionRegistry.containsBeanDefinition("bill");
        boolean yellow = beanDefinitionRegistry.containsBeanDefinition("person");
        if(person && yellow){
            beanDefinitionRegistry.registerBeanDefinition("rain",new RootBeanDefinition(Rainbow.class));
        }
    }
}
