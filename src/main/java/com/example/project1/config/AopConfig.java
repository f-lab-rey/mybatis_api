package com.example.project1.config;

import com.example.project1.aop.LoginRequiredAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean
    public LoginRequiredAspect loginRequired() {
        return new LoginRequiredAspect();
    }
}
