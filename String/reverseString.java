package String;

import java.util.Scanner;

//WAJP to reverse the user entered string 
public class reverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String s1=sc.nextLine();
		String rev="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch=s1.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println("after reversing");
		System.out.println(rev);
	}

}
