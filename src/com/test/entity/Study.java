package com.test.entity;

public interface Study {
    default void study() {
        System.out.println("我是默认实现");
    };
}
