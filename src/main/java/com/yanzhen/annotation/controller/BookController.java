package com.yanzhen.annotation.controller;

import com.yanzhen.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
}
