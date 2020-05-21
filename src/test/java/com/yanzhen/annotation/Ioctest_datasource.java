package com.yanzhen.annotation;

import com.yanzhen.annotation.config.MainConfigOfLifeCircle;
import com.yanzhen.annotation.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

public class Ioctest_datasource {
    @Test
    public void test_cycle(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("dev");
        annotationConfigApplicationContext.register(MainConfigOfProfile.class);
        annotationConfigApplicationContext.refresh();
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(DataSource.class);
        for(String name:beanNamesForType){
            System.out.println(name);
        }
        annotationConfigApplicationContext.close();
    }
}
