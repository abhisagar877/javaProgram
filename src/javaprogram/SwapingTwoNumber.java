package javaprogram;

public class SwapingTwoNumber {

	public static void main(String[] args) {
		int a=10 , b=20;
		System.out.println("before Swaping the value are.."+a+" "+b);
		
		//Logical 1-Using thirvariable 
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swaping the value are.."+a+" "+b);
	}
}
