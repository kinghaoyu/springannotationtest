package com.why.entity;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 9:49
 */
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    /**
     * 自己定义的初始化方法，在 car 注入到 IOC 容器中时，可以将其设置为 init-method 方法
     *  @Bean(initMethod = "init",destroyMethod = "destroy")
     */
    public void init(){
        System.out.println("car...init...");
    }

    public void destroy(){
        System.out.println("car...destroy...");
    }
}
