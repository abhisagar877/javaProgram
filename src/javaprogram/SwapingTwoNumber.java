package javaprogram;

public class SwapingTwoNumber {

	public static void main(String[] args) {
		int a=10 , b=20;
		System.out.println("before Swaping the value are.."+a+" "+b);
		
		//Logical 1-Using third variable 
		/*int t=a;
		a=b;
		b=t;
		*/
		//Second logic
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping the value are.."+a+" "+b);
		
		//Third logic 
	}
}
