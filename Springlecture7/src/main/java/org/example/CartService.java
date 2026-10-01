package org.example;

import java.util.*;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CartService implements BeanNameAware , ApplicationContextAware /*, DisposableBean /* implements InitializingBean*/ {


    Map<Integer,String> mp ;




//    initialization - map flush, clear, cache empty /invalidate , resources prepare

    public CartService(){
        mp = new HashMap<>();
        System.out.println("cart service constructor called");

   //we could have added element in here , but this is being called in creation time - we dont know many things - about dpeendecnies




    }



//    public void stop(){
//        mp.clear();
//        System.out.println("bean is getting destroyed");
//    }

//
//    //    any task which we want to perform
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("initialization callback");
//        System.out.println("bean is ready");
//    mp.put(1,"aditya");
//    mp.put(2,"rohit");
//    }
//
//


//    public void start(){
//        System.out.println("bean is ready");
//        mp.put(1,"aditya");
//        mp.put(2,"rohan");
//    }

    @PostConstruct   //it comes under jar - jakarta annotation library
    public void start2(){
        System.out.println("bean is ready");
        mp.put(1,"aditya");
        mp.put(2,"rohan");

    }

    public void addToCart(){
        System.out.println("added to cart");
    }


    public String getValue(int key){
        return mp.get(key);
    }


    @PreDestroy
    public void stop(){
        mp.clear();
        System.out.println("bean is destroying");
    }

//    @Override
//    public void destroy()throws Exception{
//        mp.clear();
//        System.out.println("bean is getting destroyed");
//    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean name is: "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context name is "+applicationContext.getClass().getName());
    }
}
