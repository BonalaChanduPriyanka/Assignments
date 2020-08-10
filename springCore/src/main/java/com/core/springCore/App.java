package com.core.springCore;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Spring.class);
    	GreeterService obj = (GreeterService)context.getBean(GreeterService.class);
        obj.printGreeting();
    }
}
