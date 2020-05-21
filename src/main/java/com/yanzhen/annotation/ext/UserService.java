package com.yanzhen.annotation.ext;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @EventListener(classes = ApplicationEvent.class)
    /**
     * EventListenerMethodProcessor使用这个来解析EventListener这个注解
     *
     * SmartInitializingSingleton原理：
     *              1.IOC容器创建并刷新容器
     *              2.finishBeanFactoryInitialization(beanFactory);初始化单实例bean
     *                      1.先创建所有的单实例bean  通过getbean（）
     *                      2.再查看这些bean是不是SmartInitializingSingleton这个类型的，如果是就调用他们的方法
     *
     */
    public void listen(ApplicationEvent event){
        System.out.println("UserService可以监听事件"+event);
    }
}
