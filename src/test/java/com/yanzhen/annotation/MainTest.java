package com.yanzhen.annotation;

import com.yanzhen.annotation.bean.Person;
import com.yanzhen.annotation.config.MainConfig;
import com.yanzhen.annotation.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class MainTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    private void beanNames(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
    @Test
    public void testImport(){
        beanNames(applicationContext);
        Object colorFactoryBean = applicationContext.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean);
    }

    @Test
    public void test3(){
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name:beanNamesForType
             ) {
            System.out.println(name);
        }
        Map<String, Person> beans = applicationContext.getBeansOfType(Person.class);
        System.out.println(beans);
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] names = applicationContext.getBeanDefinitionNames();
//        for(String name: names){
//            System.out.println(name);
//        }
       System.out.println("ioc容器创建完成");
       Object person = applicationContext.getBean("person");
//        Object person1 = applicationContext.getBean("person");
//        System.out.println(person==person1);
//        System.out.println(person);
    }
}
