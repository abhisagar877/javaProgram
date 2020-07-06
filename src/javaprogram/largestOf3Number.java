package javaprogram;

import java.util.Scanner;

public class largestOf3Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println( "entre first number");
		int a=sc.nextInt();
		
		System.out.println("entre scecond number");
		int b=sc.nextInt();
		
		System.out.println("entre Third numbers:");
		int c=sc.nextInt();
		//Aproch 1
		if (a>b && a>c)
		{
			 System.out.println(a+ " is largest number ");
		}
		else if (b>a && b>c)
		{
			 System.out.println(b+ " is largest number ");
		}
		else 
		{
			System.out.println(c+ " is largest number");
		}
		
		
		//Ternary Operator
		//int largest1 =a>b?a:b;
		//int largest2=c>largest1?c:a>b?a:b;
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+ "is number is largest ");
		
		
		
	}
}
