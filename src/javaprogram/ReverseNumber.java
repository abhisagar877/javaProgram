package javaprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre a number");
		
		int num= sc.nextInt();
		//i-using alogrithum
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num= num /10;
		}
		
		System.out.println("Reverse Number is: "+ rev);
	}

}
