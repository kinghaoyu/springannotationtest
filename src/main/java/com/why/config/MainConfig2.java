package com.why.config;

import com.why.condition.LinuxCondition;
import com.why.condition.MyImportBeanDefinitionRegistrar;
import com.why.condition.MyImportSelector;
import com.why.condition.WindowsCondition;
import com.why.entity.Color;
import com.why.entity.ColorFactoryBean;
import com.why.entity.Person;
import com.why.entity.Red;
import org.springframework.context.annotation.*;

/**
 * @author wanghaoyu
 * @date 2018/8/29 - 15:12
 */
@Configuration
@ComponentScan("com.why")
@Import({ MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {
    /**
     *  注册一个 ColorFactoryBean , 但是默认是返回 Color 对象
     *  它的默认 id 是 colorFactoryBean() 的方法名 colorFactoryBean
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

    @Bean
    public Person person(){
        System.out.println("创建类一个Person 对象");
        return new Person(new Integer("1"),"xiaoming");
    }

    @Conditional(value = WindowsCondition.class)
    @Bean("bill")
    public Person person01(){
        return new Person(new Integer("2"),"Bill Gates");
    }
    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return new Person(new Integer("3"),"Linus");
    }
}
