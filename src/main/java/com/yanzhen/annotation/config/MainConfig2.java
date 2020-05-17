package com.yanzhen.annotation.config;

import com.yanzhen.annotation.bean.Color;
import com.yanzhen.annotation.bean.ColorFactoryBean;
import com.yanzhen.annotation.bean.Person;
import com.yanzhen.annotation.condition.LinuxCondition;
import com.yanzhen.annotation.condition.WindowsCondition;
import org.springframework.context.annotation.*;

@Configuration
@Conditional(WindowsCondition.class)
@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {
    //单实例的在创建容器时就会添加bean
    @Scope
    @Lazy
    @Bean
    public Person person(){
        System.out.println("给容器中添加person");
        return  new Person("zhangsan",123);
    }

    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person person1(){
        return new Person("bill",65);
    }
    @Bean("linus")
    @Conditional(LinuxCondition.class)
    public Person person2(){
        return new Person("linus",44);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
