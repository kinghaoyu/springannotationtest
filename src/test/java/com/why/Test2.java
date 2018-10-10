package com.why;

import com.why.config.MainConfig2;
import com.why.config.MainConfig3;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 10:00
 */
public class Test2 {
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
        applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames){
            System.out.println(name);
        }
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
