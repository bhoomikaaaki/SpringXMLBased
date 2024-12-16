package com.bhoomi.spring.SpringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        
        HelloWorld helloWorld=(HelloWorld)context.getBean("hello");
        
        helloWorld.sayHello();
        
        Message message=(Message)context.getBean("msg");
        
        //message.setMessage("hello");--setting the value manually
        
        System.out.println(message.getMessage());//setting the value from xml file
        
        message.sayMessage();
        
        User user=(User)context.getBean("user");
        
        System.out.println(user);
        
        
        
    }
}
