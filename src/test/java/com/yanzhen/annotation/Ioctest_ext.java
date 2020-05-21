package com.yanzhen.annotation;

import com.yanzhen.annotation.ext.ExtConfig;
import com.yanzhen.annotation.tx.Txconfig;
import com.yanzhen.annotation.tx.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ioctest_ext {
    @Test
    public void test_cycle(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        annotationConfigApplicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
        });
        annotationConfigApplicationContext.close();
    }
}
