package com.why.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wanghaoyu
 * @date 2018/8/30 - 8:18
 */
public class MyImportSelector implements ImportSelector {
    /**
     * 返回值，就是导入到容器中的组件全类名
     * @param annotationMetadata 当前标注 @Import 注解的类的所有注解信息
     * @return
     */
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //方法不能返回 null 值
        return new String[]{"com.why.entity.Blue","com.why.entity.Red"};
    }
}
