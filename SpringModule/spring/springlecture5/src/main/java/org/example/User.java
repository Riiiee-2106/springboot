package org.example;

import org.springframework.stereotype.Component;

//@Component -- we cannot directly pu Component annotation here
public class User {


//   1. problem to not use component ---> primitives and we have not given values to it
//   2. problem to not use component  --->code coming from third party library , means using jar file, which is .class files , we cannot rewrite (read only files) we cannot make it compoent anontation
//  here comes the appConfig class use - and we use @Bean to create object (ourself) and then spring will manage it
    private String name;
    private int age;

//    spring cannot give random value to name and age - we need to tell this

    User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
