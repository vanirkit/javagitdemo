package com.git.com;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3553;
		int reversenum=0;
		int remainder;
		
		int OriginalNum=num;
		while(num!=0) {
			remainder=num%10;
			reversenum=reversenum*10+remainder;
			num/=10;
			
		}
		if(OriginalNum==reversenum) {
			System.out.println(OriginalNum +" is palindrome");
			
		}else{
			System.out.println( OriginalNum +"is not palindrome");

		}

	}

}
