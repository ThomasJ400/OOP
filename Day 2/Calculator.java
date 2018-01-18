/**
* Author: Thomas Jones
* Date of Creation: 18/01/18
* Date of Last Edit: 18/01/18
* Purpose: Calculator to add, subtract, divide and multiply
**/

import java.util.Scanner;

public class Calculator
{
	public static void main(String [] args)
	{//start of main method		
		add();
		subtract();
		multiply();
		divide();
		add();
	}//end of main method
	
	public static void add()
	{//start of add method
		int num1 = 2;
		int num2 = 4;
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);	
	}//end of add method
	
	public static void subtract()
	{//start of subtract method
		int num1 = 6;
		int num2 = 3;
		int diff = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + diff);			
	}//end of subtract method
	
	public static void multiply()
	{//start of multiply method
		int num1 = 7;
		int num2 = 8;
		int prod = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + prod);	
	}//end of multiply method
	
	public static void divide()
	{//start of divide method
		double num1 = 40;
		double num2 = 5;
		double div = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + div);	
	}//end of divide method
}