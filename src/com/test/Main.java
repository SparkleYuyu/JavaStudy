package com.test;

//import com.test.entity.Person;
import com.test.entity.*;

public class Main{
    public static void main(String[] args){
    Student s = new Student("小明", 18, "男");
    Teacher t = new Teacher("老王", 40, "男");
    s.study();
    t.study();
    s.setStatus(Status.RUNNING);
    System.out.println(s.getStatus().getName());


        
    }
}
