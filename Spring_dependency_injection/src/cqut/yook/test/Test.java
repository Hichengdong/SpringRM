package cqut.yook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.model.Dep;
import cqut.yook.model.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cBeans.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		((ConfigurableApplicationContext) context).close();
	}
}
