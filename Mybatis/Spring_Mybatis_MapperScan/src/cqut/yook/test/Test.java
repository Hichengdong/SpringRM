package cqut.yook.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.entity.User;
import cqut.yook.service.UserService;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) context.getBean("userService");
		List<User> listUser = service.selectUser();
		listUser.forEach(user -> System.out.println(user));
		((ConfigurableApplicationContext) context).close();
	}
}
