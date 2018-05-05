package com.dem.custtrack.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	private Logger log = Logger.getLogger(LogAspect.class);

	@Pointcut("execution(* com.dem.custtrack.controller.*.*(..))")
	private void forControllerPackage() {

	}

	@Pointcut("execution(* com.dem.custtrack.service.*.*(..))")
	private void forServicePackage() {

	}

	@Pointcut("execution(* com.dem.custtrack.dao.*.*(..))")
	private void forDaoPackage() {

	}

	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {

	}

	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		log.info("======> in @Before: calling method: " + method);

		log.info("======> in @Before: with arguments: ");
		Object[] params = joinPoint.getArgs();
		for (Object object : params) {
			log.info("======> " + object.toString());
		}
	}

	@AfterReturning(pointcut = "forAppFlow()", returning = "result")
	public void after(JoinPoint joinPoint, Object result) {
		String method = joinPoint.getSignature().toShortString();
		log.info("======> in @After returning: from method: " + method);
		log.info("======> in @After returning: with result: " + result);
	}

}
