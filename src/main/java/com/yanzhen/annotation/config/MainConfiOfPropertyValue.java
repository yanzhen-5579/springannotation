package com.yanzhen.annotation.config;

import com.yanzhen.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:/person.properties")
public class MainConfiOfPropertyValue {

    @Bean

    public Person person(){
        return new Person();
    }
}
