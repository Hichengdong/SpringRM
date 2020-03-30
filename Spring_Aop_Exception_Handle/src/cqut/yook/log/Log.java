package cqut.yook.log;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Log {
	@AfterThrowing(throwing = "ex",  pointcut = "execution(* cqut.yook.service.impl.*.*(..))")
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("Å×³öÁËÒì³£" + ex.getClass().getName());
	}
}
