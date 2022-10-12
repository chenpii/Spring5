package com.chenp.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.chenp.spring5.aopanno")
@EnableAspectJAutoProxy
public class SpringConfig {
}
