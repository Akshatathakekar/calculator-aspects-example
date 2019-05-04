package com.capgemini.test;
import com.capgemini.math.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator cal=context.getBean(Calculator.class);
		//System.out.println(cal.add(-10,-12));
		try
		{
			System.out.println(cal.add(-10,-12));
			int a=cal.add(-10,-12);
			System.out.println(a);
			System.out.println(cal.divide(10,0));
		}
		catch(Exception e)
		{

		}

		
		
	}


}