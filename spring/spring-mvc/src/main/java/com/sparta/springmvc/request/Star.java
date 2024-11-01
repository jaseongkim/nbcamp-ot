package com.sparta.springmvc.request;

import lombok.Getter;
import lombok.Setter;

public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }
}