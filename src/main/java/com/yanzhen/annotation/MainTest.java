package com.yanzhen.annotation;

import com.yanzhen.annotation.bean.Person;
import com.yanzhen.annotation.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for(String name : beanNamesForType){
            System.out.println(name);
        }
    }
}
