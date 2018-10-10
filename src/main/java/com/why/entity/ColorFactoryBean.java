package com.why.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 9:23
 * 创建一个 Spring 定义的 FactoryBean
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    /**
     * @return 返回一个 Color 对象， 这个对象会添加到容器中。
     * @throws Exception
     */
    public Color getObject() throws Exception {
        return new Color();
    }

    /**
     * 返回对象的类型
     */
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是单例？
     * true : 这个 bean 是单实例，在容器中保存一份
     * false : 多实例， 每次获取都会创建一个新的 bean;
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
