package cqut.yook.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.dao.UserDao;
import cqut.yook.entity.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao dao = (UserDao) context.getBean("userDao");
		List<User> listUser = dao.selectUser();
		listUser.forEach(user -> System.out.println(user));
		((ConfigurableApplicationContext) context).close();
	}
}
