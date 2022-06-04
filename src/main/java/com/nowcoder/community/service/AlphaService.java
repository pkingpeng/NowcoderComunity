package com.nowcoder.community.service;

import com.nowcoder.community.DAO.AlphaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @file: AlphaService.java
 * @time: 2022/4/15 22:42
 * @Author by Pking
 */

@Service
//@Scope("prototype") //每次getBean 都会实例化 一般用默认的single
public class AlphaService {

    @Autowired
    private AlphaDAO alphaDAO;

    public AlphaService() {
        System.out.println("construct alphaService");
    }

    @PostConstruct //在构造器之后调用该方法
    public void init() {
        System.out.println("init alphaService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destory alphaService");
    }

    public String find() {
        return alphaDAO.select();
    }
}
