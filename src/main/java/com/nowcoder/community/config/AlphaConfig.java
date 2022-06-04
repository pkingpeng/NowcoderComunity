package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @file: AlphaConfig.java
 * @time: 2022/4/15 22:52
 * @Author by Pking
 */


@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat() { //方法名字 就是bean名
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
