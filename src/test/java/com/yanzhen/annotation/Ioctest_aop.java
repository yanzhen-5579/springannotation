package com.yanzhen.annotation;

import com.yanzhen.annotation.aop.MathCalculator;
import com.yanzhen.annotation.config.MainConfigOfAOP;
import com.yanzhen.annotation.config.MainConfigOfLifeCircle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ioctest_aop {
    @Test
    public void test_cycle(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
//        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for(String name:beanDefinitionNames){
//            System.out.println(name);
//        }
        MathCalculator mathCalculator = (MathCalculator) annotationConfigApplicationContext.getBean("mathCalculator");
        mathCalculator.div(1,1);
        annotationConfigApplicationContext.close();
    }
}
