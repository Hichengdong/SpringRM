package cqut.yook.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getName() + "的" + method.getName() + "执行完毕,返回值为" + returnValue);
	}

}
