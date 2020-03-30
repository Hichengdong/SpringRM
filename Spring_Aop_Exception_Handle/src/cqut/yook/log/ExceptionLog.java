package cqut.yook.log;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLog implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		System.out.println("ִ��: " + target.getClass().getName() + "��" + method.getName() + "����,+����Ϊ:("
				+ Arrays.toString(args) + ")+,�׳����쳣" + ex.getClass().getName());
	}
}
