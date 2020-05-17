package com.yanzhen.annotation.config;

import com.yanzhen.annotation.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfigOfLifeCircle {

    //多实例的情况下，容器是懒加载，什么时候调用什么时候创造 容器不管销毁。单实例时启动容器即创造，容器关闭即销毁
//    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
