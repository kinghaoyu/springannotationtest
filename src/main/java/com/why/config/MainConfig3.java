package com.why.config;

import com.why.condition.LinuxCondition;
import com.why.condition.MyImportBeanDefinitionRegistrar;
import com.why.condition.MyImportSelector;
import com.why.condition.WindowsCondition;
import com.why.entity.Car;
import com.why.entity.Cat;
import com.why.entity.ColorFactoryBean;
import com.why.entity.Person;
import org.springframework.context.annotation.*;

/**
 * @author wanghaoyu
 * @date 2018/8/29 - 15:12
 */
@Configuration
@ComponentScan(value = "com.why",useDefaultFilters = false,includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyTypeFilter2.class)
})
public class MainConfig3 {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
