package com.test.entity;

public class Teacher extends Person implements Study {
    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void study() {
        System.out.println("我是" + name + ", 要学更多知识");
    }

    public void hello() {
        System.out.println("我是语文老师，我叫" + name + " ,今年" + age + "岁");
    }
}
