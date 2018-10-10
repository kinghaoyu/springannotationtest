package com.why;

import com.why.config.MainConfig;
import com.why.config.MainConfig2;
import com.why.entity.Color;
import com.why.entity.ColorFactoryBean;
import com.why.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author wanghaoyu
 * @date 2018/8/29 - 15:15
 */
public class Test1 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("--------IOC 容器创建完成--------");
        Person person = applicationContext.getBean(Person.class);
        Person person1 = applicationContext.getBean(Person.class);


        System.out.println(person == person1);
        System.out.println(person);


    }

    @Test
    public void testImport(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames){
            System.out.println(name);
        }
        Color color = (Color) applicationContext.getBean("colorFactoryBean");
        System.out.println("colorFactoryBean--->"+color);

        ColorFactoryBean colorFactoryBean = (ColorFactoryBean) applicationContext.getBean("&colorFactoryBean");
        System.out.println("&colorFactoryBean--->"+colorFactoryBean);
    }

    @Test
    public void testNames(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);

        for (String name : namesForType){
            System.out.println(name);
        }

    }
}
