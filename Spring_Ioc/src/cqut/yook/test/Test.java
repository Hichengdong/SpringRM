package cqut.yook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqut.yook.bean.Person;

public class Test {
	public static void main(String[] args) {
		// ����beans.xml�ļ����ɹ�����Ӧbean����
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person");
		person.Call();
		// �ر�context
		((ConfigurableApplicationContext) context).close();
	}
}
