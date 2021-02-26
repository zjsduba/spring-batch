package com.example.springbatch.autoWired;

import com.example.springbatch.bean.Person;
import com.example.springbatch.value.PropertySourceTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: lsp
 * @Date: 2020/12/7 11:18
 * @Version 1.0
 * @Description:
 */
@SpringBootTest
class DiTestTest {
    @Resource
    ApplicationContext applicationContext;

    @Test
    public void TestDi(){
        BookController bookController = applicationContext.getBean(BookController.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookController);
        System.out.println(bookService);
        System.out.println(bookController.getBookService()==bookService);
    }
}