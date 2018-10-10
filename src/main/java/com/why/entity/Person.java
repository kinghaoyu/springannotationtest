package com.why.entity;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author wanghaoyu
 * @date 2018/8/29 - 15:14
 */
public class Person {
    /**
     * 使用 @Value 赋值 ：
     * 1. 基本数值；
     * 2. 可以写 SpEL: #{}
     * 3. 可以引入配置文件的属性值： ${}
     */
    @Value("#{100 - 20}")
    private Integer id;
    @Value("小红")
    private String name;
    @Value("${person.nickName}")
    private String nickName;

    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
