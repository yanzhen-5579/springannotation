package com.yanzhen.annotation;

import com.yanzhen.annotation.config.MainConfiOfPropertyValue;
import com.yanzhen.annotation.config.MainConfigOfLifeCircle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ioctest_propertyvalue {
    @Test
    public void test_propertyvalye(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfiOfPropertyValue.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
        Object person = annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
    }
}
