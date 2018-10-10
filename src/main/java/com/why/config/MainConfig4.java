package com.why.config;

import com.why.entity.Car;
import com.why.entity.Person;
import org.springframework.context.annotation.*;

/**
 * @author wanghaoyu
 * @date 2018/8/29 - 15:12
 */
@Configuration
@PropertySource(value = "classpath:/person.properties")
public class MainConfig4 {
    @Bean
    public Person person(){
        return new Person();
    }
}
