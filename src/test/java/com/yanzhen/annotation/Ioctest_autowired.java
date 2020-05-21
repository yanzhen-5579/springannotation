package com.yanzhen.annotation;

import com.yanzhen.annotation.config.MainConfigAutowired;
import com.yanzhen.annotation.config.MainConfigOfLifeCircle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ioctest_autowired {
    @Test
    public void test_cycle(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigAutowired.class);
        Object bookService = annotationConfigApplicationContext.getBean("boss");
//        System.out.println(bookService);
        Object car = annotationConfigApplicationContext.getBean("car");
//        System.out.println(car);
        System.out.println(annotationConfigApplicationContext);
        annotationConfigApplicationContext.close();
    }
}
