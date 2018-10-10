package com.why.condition;

import com.why.entity.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 8:54
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param annotationMetadata 当前类的注解信息
     * @param beanDefinitionRegistry  是 注册类：
     *                                  把所有需要添加到容器中的 bean 通过调用
     *                                      beanDefinitionRegistry.registerBeanDefinition(String var1, BeanDefinition var2)手工注册进来
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean definition = beanDefinitionRegistry.containsBeanDefinition("com.why.entity.Blue");
        boolean definition2 = beanDefinitionRegistry.containsBeanDefinition("com.why.entity.Red");
        if (definition && definition2){

            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //可以指定 bean 名
            beanDefinitionRegistry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
