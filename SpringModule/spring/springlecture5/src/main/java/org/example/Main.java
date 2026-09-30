package org.example;

import org.example.payment.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


//        made object of paymentservice
        /*PaymentService paymentService = new PaymentService();
        OrderService order = new OrderService(paymentService);
        order.placeOrder();*/


//        instead of passing dependency through main we want to use spring framework - notes reffer


//we need to tell spring which objects of which class to make and maintain - for this we use @Component
//after this we need to up the ioc container - ApplicationContext (interface)

//        use annotation based configuration to start spring container
//        to tell all information and rules to spring container - we call it Appconfig.class - and pass it in Annotationcontext
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class); //method
//        order.placeOrder();
//
//
//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();


        User user = context.getBean(User.class);
        System.out.println(user.getName());

/* reflections api

Student s1 = new Student;

we have special class - named -->Class
class hold metadata of different types of class

Class <Student> c1 = Student.class;

c1 is not object , it stores metadata of student
c1 stores-
className - student
fields - name,age
constructor - student()
method - getAttendace()
annotations

all metadata of class

class Student{
private String name;
private int age;

public Student(){

}


public void getAttendance(){


}




 */


//        so we keep main clean - by using configuration class for all configurations and making beans etc...



    }
}