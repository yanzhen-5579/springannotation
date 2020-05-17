package com.yanzhen.annotation;

import com.yanzhen.annotation.config.MainConfigOfLifeCircle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ioctest_lifeCycle {
    @Test
    public void test_cycle(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCircle.class);
        System.out.println("容器初始化完成");
//        annotationConfigApplicationContext.getBean("car");
        annotationConfigApplicationContext.close();
    }
}
