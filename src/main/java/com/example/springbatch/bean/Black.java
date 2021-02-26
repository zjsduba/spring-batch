package com.example.springbatch.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: lsp
 * @Date: 2020/12/4 10:28
 * @Version 1.0
 * @Description:
 */
@Data
public class Black implements InitializingBean, DisposableBean {
    private String color;

    public Black() {
        System.out.println("this is a constructor method:" + Black.class.getName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is a init method:" + Black.class.getName());
    }

    @Override
    public void destroy() {
        System.out.println("this is a destroy method:" + Black.class.getName());
    }

    @PostConstruct
    public void init(){
        System.out.println("this is a PostConstruct method"+ Black.class.getName());
    }

    @PreDestroy
    public void destroy2(){
        System.out.println("this is a PreDestroy method"+ Black.class.getName());
    }

    public void init3(){
        System.out.println("this is a init3-method"+ Black.class.getName());
    }
    public void destroy3(){
        System.out.println("this is a destroy3-method"+ Black.class.getName());
    }


}
