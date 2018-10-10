package com.why;

import com.why.config.MainConfig2;
import com.why.config.MainConfig3;
import com.why.config.MainConfig4;
import com.why.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 10:00
 */
public class Test3 {
    AnnotationConfigApplicationContext applicationContext = null;
//    @Before
//    public void befor(){
//         applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
//
//    }

    @Test
    public void Test(){
        //创建 IOC　容器
        applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        System.out.println("IOC 容器创建完成。。。");

        //关闭 IOC 容器
        applicationContext.close();
        System.out.println("IOC 容器关闭。。。");
    }

    @Test
    public void test2(){
        applicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        //当配置文件的值被加载后就可以通过这样的方式获取
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String name = environment.getProperty("person.nickName");
        System.out.println(name);
    }
    @Test
    public void test3(){
        applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames){
            System.out.println(name);
        }
    }
}
