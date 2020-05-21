package com.yanzhen.annotation.ext;


import com.yanzhen.annotation.bean.Color;
import com.yanzhen.annotation.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 1.ioc容器创建
 * 2.执行invokeBeanFactoryPostProcessors(beanFactory)方法
 *      如何找到beanfactorypostprocessor并执行他们的方法
 *
 * BeanDefinitionRegistryPostProcessor BeanFactoryPostProcessor的子接口
 *      postProcessBeanDefinitionRegistry
 *      bean定义信息将要被加载时进行调用
 */
@Configuration
@ComponentScan("com.yanzhen.annotation.ext")
public class ExtConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }

}
