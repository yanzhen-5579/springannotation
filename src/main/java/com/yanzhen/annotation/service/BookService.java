package com.yanzhen.annotation.service;

import com.yanzhen.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
//    @Autowired()
//    @Qualifier("bookDao")          //指定装配的组件的id
    @Resource(name = "bookDao2")
    BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
