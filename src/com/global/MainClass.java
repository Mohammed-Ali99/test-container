package com.global;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		// Employee emp = new Employee();
		
		// BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();  // to apply Disposable interface
		
		Employee emp = (Employee) context.getBean("emp");
		
		Department depart = (Department) context.getBean("depart");
		
		emp.printName();
	}

}
