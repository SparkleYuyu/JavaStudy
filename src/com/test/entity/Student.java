package com.test.entity;

public class Student extends Person implements Study {
    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    private Status status;
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

//    public void study() {
//        System.out.println("我是" + getName() + "正在学Java");
//    }

    public void hello() {
        System.out.println("我是子类的hello，权限为public");
    }

}
