package com.tousif.AnnotationConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		//1.
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBasedConfig.xml");
				
		Vehicle obj = (Vehicle)context.getBean("car");
		//By Default Name is decapitalize name of class(Car=car, Bike=bike) 
		
		obj.drive();
		
		
		Tyre tyre = (Tyre)context.getBean("tyre");
		System.out.println("(I'm inside App) Vale of tyre : " + tyre);
		
		
	}

}
