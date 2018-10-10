package com.why.config;

import com.why.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author wanghaoyu
 * @date 2018/8/29 - 15:12
 */
@Configuration
@ComponentScan(value = "com.why", useDefaultFilters = false, includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {PersonDao.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = {MyTypeFilter.class})

})
public class MainConfig {
    @Bean
    public Person person(){
        return new Person(new Integer("1"),"xiaoming");
    }
}
