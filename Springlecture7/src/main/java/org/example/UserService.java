package org.example;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component("userservice")
public class UserService implements BeanNameAware, ApplicationContextAware {


//    99% business logic don't need aware interface - it is most required in logs


    @Override
    public void setBeanName(String name){  //why set rather than getBeanName
        System.out.println("bean name is: "+name);
    } //we don't call it ,spring call this, because we implemented aware interface
//spring set it
//    required in log


//    if we use xml configuration and annotation based annotation  - both to manage our beans
//    (then we should know ehere the container came from then we use aware interfaces)



    @Override
    public void setApplicationContext(ApplicationContext applicationContext)throws BeansException {
        System.out.println("application context name is "+applicationContext.getClass().getName());
    }

    public String getBeanName(){
        return "userBean";
    }



    public UserService(){
        System.out.println("User service constructor called");
    }
}
