package com.capgemini.math;
import org.springframework.stereotype.Component;

@Component
public class CalculatorExample implements Calculator
{
	
	//public void add(int num1,int num2)
	//{
	//	System.out.println(num1+num2);
		//return num1+num2;
	//}
	//public void divide(int num1,int num2)
	//{
	//	System.out.println(num1/num2);
		//return num1/num2;
	//}
	
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int divide(int num1,int num2)
	{
		return num1/num2;
		
	}
	


}