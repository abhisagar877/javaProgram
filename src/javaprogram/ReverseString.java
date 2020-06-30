package javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		//Using contanitaion
		String str= "Abcd";
		String rev="";
		/*
		int len=str.length();
		str.charAt(0);
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reversed String is:"+ rev);
		*/
		//Using char Array
		/*char a[]=str.toCharArray();
		int len=a.length;
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("revsred String is: + rev"); */
		
		// Using String Buffer class
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());
	
		
	}
}
