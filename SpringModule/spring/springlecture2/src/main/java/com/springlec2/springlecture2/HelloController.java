package com.springlec2.springlecture2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // gateway to write your endpoint
public class HelloController {

//    if someone hit /hello with method of endpoint should get called

    @GetMapping("hello")
    public String hello(){
        return "<h1>Hello World</h1>";
}


    @GetMapping("bye")
        public String sayBye(){
            return "bye";
        }
    }

