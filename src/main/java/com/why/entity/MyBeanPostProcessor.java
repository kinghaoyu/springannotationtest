package com.why.entity;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 17:15
 * 后置处理器： 初始化前后进行处理工作
 * 将后置处理器加入到容器中
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+bean +"--->"+beanName);
        return bean;

    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+bean +"--->"+beanName);
        return bean;
    }
}
