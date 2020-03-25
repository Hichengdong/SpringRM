package cqut.yook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.bean.Person;

public class Test {
	public static void main(String[] args) {
		// 解析beans.xml文件生成管理相应bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person");
		person.Call();
		// 关闭context
		((ConfigurableApplicationContext) context).close();
	}
}
