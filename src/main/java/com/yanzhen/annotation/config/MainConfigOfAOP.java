package com.yanzhen.annotation.config;

import com.sun.org.apache.regexp.internal.REUtil;
import com.yanzhen.annotation.aop.LogAspects;
import com.yanzhen.annotation.aop.MathCalculator;
import com.yanzhen.annotation.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return  new LogAspects();
    }

//    @Bean
//    public Color color(){
//        return new Color();
//    }
}
