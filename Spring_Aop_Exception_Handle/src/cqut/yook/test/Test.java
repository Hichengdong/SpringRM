package cqut.yook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.service.UserService;
import cqut.yook.service.impl.UserServiceImpl;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) context.getBean("userService");
		service.add();
		((ConfigurableApplicationContext) context).close();
	}
}
