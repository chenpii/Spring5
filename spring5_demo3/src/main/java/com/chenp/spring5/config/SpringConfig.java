package com.chenp.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类
@ComponentScan(basePackages = {"com.chenp.spring5"}) //开启扫描
public class SpringConfig {
}
