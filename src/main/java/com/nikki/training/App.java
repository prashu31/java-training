package com.nikki.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Aliean aa = (Aliean) factory.getBean("aliean");
    	aa.age = 20;
    	System.out.println(aa.age);
    	
    	Aliean aa2 = (Aliean) factory.getBean("aliean");
    	
    	System.out.println(aa2.age); 	
//    	aa.code();
    }
}
