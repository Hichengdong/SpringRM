package cqut.yook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.model.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
		// ͨ��id ��ȡbean
		User user = (User) context.getBean("myUser");
		user.display();
		// ͨ��class ��ȡbean
		User user2 = (User) context.getBean(User.class);
		user2.display();
		((ConfigurableApplicationContext) context).close();
	}
}
