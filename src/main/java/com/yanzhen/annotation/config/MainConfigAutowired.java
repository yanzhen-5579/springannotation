package com.yanzhen.annotation.config;

import com.yanzhen.annotation.dao.BookDao;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"com.yanzhen.annotation.controller","com.yanzhen.annotation.dao","com.yanzhen.annotation.service","com.yanzhen.annotation.bean"})
public class MainConfigAutowired {
    @Bean
    @Primary
    public BookDao bookDao2(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return  bookDao;
    }
}
