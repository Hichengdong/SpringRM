package cqut.yook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.service.MessageService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageService ms = (MessageService) context.getBean("messageService");
		ms.handle();
		((ConfigurableApplicationContext) context).close();
	}
}
