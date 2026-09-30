package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3. appconfig
@Configuration
@ComponentScan
public class AppConfig {

   /* @Bean
    public User getUser(){
        return new User();
    }  4. how spring call this? as Appconfig has no object, but appconfig is a componenent class and configuration class , internally
     it uses component annotation*/


}
