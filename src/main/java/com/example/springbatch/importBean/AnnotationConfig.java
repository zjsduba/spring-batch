package com.example.springbatch.importBean;

import org.springframework.context.annotation.*;


/**
 * @Author: lsp
 * @Date: 2020/12/3 16:07
 * @Version 1.0
 * @Description:
 */
@Configuration
public class AnnotationConfig  {


    @Bean
    ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
