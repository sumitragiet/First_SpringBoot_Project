package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.service.Car;

public class Test {
	public static void method(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car service = context.getBean(Car.class);

		service.runCar();

	}

}
