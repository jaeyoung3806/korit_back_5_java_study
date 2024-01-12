package com.study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
}
