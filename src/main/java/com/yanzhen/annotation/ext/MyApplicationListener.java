package com.yanzhen.annotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    //当容器中发布此事件后，监听功能触发
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到的时间"+event);
    }
}
