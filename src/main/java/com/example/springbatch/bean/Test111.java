package com.example.springbatch.bean;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: lsp
 * @Date: 2020/12/4 10:28
 * @Version 1.0
 * @Description:
 */
@Data
public class Test111  {
    private String color;

}
