package com.why.config;

import com.why.aop.LogAspects;
import com.why.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wanghaoyu
 * @date 2018/8/31 - 13:43
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigAop {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
