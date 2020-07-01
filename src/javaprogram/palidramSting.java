package javaprogram;

import java.util.Scanner;

public class palidramSting {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("entre your String;");
	
		String str=Sc.next();
		String org_str=str;
		String rev="";
		
		int len=str.length();
	
		
		for(int i=len-1;i>=0;i--);
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		if (org_str.equals(rev)){
			System.out.println(org_str+" is palidram String");
		}
		else
		{
			System.out.println(org_str+" is not palidramString");
		}
	}
	
}
