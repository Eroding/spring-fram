package com.cnh;

import com.cnh.service.demoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CnhDemo {
	public static void main(String[] args) {
		System.out.println("s");
		String xmlPath = "D:\\spring-framework\\springdemo\\src\\main\\resource\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		demoService demoServices =  (demoService)applicationContext.getBean("demoService");
		System.out.println(demoServices.syHello());
	}
}
