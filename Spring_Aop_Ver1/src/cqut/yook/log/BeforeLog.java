package cqut.yook.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("µ÷ÓÃ" + target.getClass().getName() + "µÄ" + method.getName());
	}
}
