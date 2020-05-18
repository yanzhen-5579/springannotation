package com.yanzhen.annotation.config;

import com.yanzhen.annotation.bean.Person;
import com.yanzhen.annotation.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
//使用只包含这个功能时，需要把默认的配置为false
@ComponentScan(value = "com.yanzhen.annotation",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = BookService.class)
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeFilter.class)
},useDefaultFilters = false)
public class MainConfig {
    @Bean("person")
    public Person get(){
        return new Person("xiaoli",123,null);
    }
}
