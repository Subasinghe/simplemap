package com.bpcbt.demo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * This class is utilizing Spring AOP for logging aspect. It has used Pointcut
 * expressions to define methods where each advice should be applied.
 * 
 * @author Sudharma Subasinghe
 */
@Aspect
@Component
public class SimpleMapLoggingAspect {

	private Logger log = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.bpcbt.demo.controller.*.*(..))")
	private void forControllerPackage() {
	}

	@Pointcut("execution(* com.bpcbt.demo.doa.*.*(..))")
	private void forDOAPackage() {
	}

	@Pointcut("execution(* com.bpcbt.demo.service.*.*(..))")
	private void forServicePackage() {
	}

	@Pointcut("forControllerPackage() || forDOAPackage() || forServicePackage()")
	private void forAppFlow() {
	}

	/**
	 * This logs before execution of methods defined by Pointcut expressions.
	 * 
	 * @param joinPoint
	 *            the execution of a method
	 */
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {

		String method = joinPoint.getSignature().toShortString();
		log.info("==========> in @Before: " + method);

		Object[] params = joinPoint.getArgs();
		for (Object param : params) {
			log.info("==========> argument: " + param);
		}
	}

	/**
	 * This logs after successful execution of methods defined by Pointcut
	 * expressions.
	 * 
	 * @param joinPoint
	 *            the execution of a method
	 * @param result
	 *            the returned result object after successful execution
	 */
	@AfterReturning(pointcut = "forAppFlow()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {

		String method = joinPoint.getSignature().toShortString();
		log.info("==========> in @AfterReturning: " + method);

		log.info("==========> Result: " + result);
	}

}
