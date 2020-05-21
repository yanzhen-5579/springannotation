package com.yanzhen.annotation.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//BeanFactoryPostProcessor所有bean已经定义，但是还没有实例化

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor   postProcessBeanFactory方法执行了");
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
        System.out.println("当前beanfactory有bean+"+beanDefinitionCount);
    }
}
