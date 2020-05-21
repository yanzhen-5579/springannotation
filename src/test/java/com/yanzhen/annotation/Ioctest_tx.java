package com.yanzhen.annotation;

import com.yanzhen.annotation.aop.MathCalculator;
import com.yanzhen.annotation.config.MainConfigOfAOP;
import com.yanzhen.annotation.tx.Txconfig;
import com.yanzhen.annotation.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ioctest_tx {
    @Test
    public void test_cycle(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Txconfig.class);
        UserService userService = (UserService) annotationConfigApplicationContext.getBean("userService");
        userService.insert();
        annotationConfigApplicationContext.close();
    }
}
