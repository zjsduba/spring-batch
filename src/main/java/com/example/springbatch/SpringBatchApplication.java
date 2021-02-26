package com.example.springbatch;

import com.example.springbatch.importBean.ImportBeanDefinitionRegistrarTest;
import com.example.springbatch.importBean.ImportSelectorTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ImportSelectorTest.class, ImportBeanDefinitionRegistrarTest.class})
public class SpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }
}
