package com.why.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 10:47
 */
public class Cat implements InitializingBean, DisposableBean {

    public Cat(){
        System.out.println("cat   constructor....");
    }

    public void destroy() throws Exception {
        System.out.println("cat....destroy....");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat....afterPropertiesSet....");
    }
}
