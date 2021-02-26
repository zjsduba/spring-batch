package com.example.springbatch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootTest
class SpringBatchApplicationTests {

    @Resource
    ApplicationContext applicationContext;


    @Test
    void testImport(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        Object bean =applicationContext.getBean("com.example.springbatch.importBean.ImportTest");
        System.out.println("导入测试"+bean);
    }
    @Test
    void testImportSelector(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        Object bean =applicationContext.getBean("com.example.springbatch.bean.Blue");
        System.out.println("导入测试"+bean);
    }
    @Test
    void testImportBeanDefinitionRegistrar(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        Object bean =applicationContext.getBean("red");
        System.out.println("导入测试"+bean);
    }
    @Test
    void testFactoryBean(String name,String size) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        //获取factorybean生成的bean
        Object importColor = applicationContext.getBean("colorFactoryBean");
        //获取容器中factorybean本身
        Object bean = applicationContext.getBean("&colorFactoryBean");
        System.out.println("获取factorybean生成的bean:"+importColor.getClass());
        System.out.println("获取容器中factorybean本身"+bean.getClass());
    }
    @Test
    void testLifecycle(){

    }
}
