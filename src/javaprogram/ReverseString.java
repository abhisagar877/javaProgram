package javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		//Using contanitaion
		String str= "Abcd";
		String rev=null;
		
		int len=str.length();
		str.charAt(0);
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	}
}
