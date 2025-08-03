package com.test.entity;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public enum Status {
    RUNNING("跑步"), STUDY("学习"), SLEEP("睡觉");

    private String name;
    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 }
