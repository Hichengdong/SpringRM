package cqut.yook.log;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLog implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		System.out.println("执行: " + target.getClass().getName() + "的" + method.getName() + "方法,+参数为:("
				+ Arrays.toString(args) + ")+,抛出了异常" + ex.getClass().getName());
	}
}
