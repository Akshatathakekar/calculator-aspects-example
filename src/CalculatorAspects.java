package com.capgemini.aspects;
import com.capgemini.math.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class CalculatorAspects
{
	
	//@Before("execution(* com.capgemini.math.CalculatorExample.add(..))")
	//public void validateAdd()
	//{
	//	System.out.println("validation successful...");

	//}
	
	//@Before("execution(* com.capgemini.math.CalculatorExample.divide(..))")
	//public void validateDivide()
	//{
	//	System.out.println("validation successful...");

	//}

	/*@Around("execution(* com.capgemini.math.CalculatorExample.add(..))")
	public void validateAdd(ProceedingJoinPoint pjp)throws Throwable
	{
		Object args[]=pjp.getArgs();
		int firstArg=Integer.parseInt(args[0].toString());
		int secondArg=Integer.parseInt(args[1].toString());

		if(firstArg > 0 && secondArg>0)
		{

			pjp.proceed();
		}
		else
		{
			System.out.println("parameters should be positive");
		}

	}

	@Around("execution(* com.capgemini.math.CalculatorExample.divide(..))")
	public void validateDivide(ProceedingJoinPoint pjp)throws Throwable
	{
		Object args[]=pjp.getArgs();
		int secondArg =Integer.parseInt(args[1].toString());
		

		if(secondArg != 0)
		{
			pjp.proceed();
		}
		else
		{
			System.out.println("Second parameter can not be zero");
		}

	} */

	
	/*@AfterReturning(pointcut="execution(* com.capgemini.math.CalculatorExample.add(..))",returning="sum")
	public void validateAdd(int sum) 
	{
		System.out.println("Addition ");
		System.out.println((int)sum);

	}

	@AfterReturning(pointcut="execution(* com.capgemini.math.CalculatorExample.divide(..))",returning="div")
	public void validateDivide(double div)
	{
		System.out.println("division ");
		System.out.println((double)div);

	}*/

	@AfterThrowing(pointcut="execution(* com.capgemini.math.CalculatorExample.add(..))",throwing="e")
	public void validateAdd(Exception e,ProceedingJoinPoint pjp)throws Throwable
	{
		System.out.println(e);
		Object args[]=pjp.getArgs();
		int firstArg=Integer.parseInt(args[0].toString());
		//int secondArg=Integer.parseInt(args[1].toString());
		
		if(firstArg <0)
		{
		
		
		}
		else
		{
			pjp.proceed();

		}
	}

	
	@AfterThrowing(pointcut="execution(* com.capgemini.math.CalculatorExample.divide(..))",throwing="ex")
	public void validateDivide(Exception ex)
	{
		System.out.println(ex);
		System.out.println("second number can not be zero");

	}
	

}