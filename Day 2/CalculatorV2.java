/**
* Author: Thomas Jones
* Date of Creation: 18/01/18
* Date of Last Edit: 18/01/18
* Purpose: Calculator to add, subtract, divide and multiply
* Version: 2.0
**/

import java.util.Scanner;

public class CalculatorV2
{
	public static void main(String [] args)
	{//start of main method	
		Scanner scan = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		
		System.out.print("Enter number 1: ");
		num1 = scan.nextDouble();
		System.out.print("Enter number 2: ");
		num2 = scan.nextDouble();
		
		add(num1,num2);
		subtract(num1,num2);
		multiply(num1,num2);
		divide(num1,num2);
	}//end of main method
	
	public static void add(double n1, double n2)
	{//start of add method
		double sum = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}//end of add method
	
	public static void subtract(double n1, double n2)
	{//start of subtract method
		double diff = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + diff);			
	}//end of subtract method
	
	public static void multiply(double n1, double n2)
	{//start of multiply method
		double prod = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + prod);	
	}//end of multiply method
	
	public static void divide(double n1, double n2)
	{//start of divide method
		double div = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + div);
	}//end of divide method
}