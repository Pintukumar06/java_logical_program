package String;

import java.util.Scanner;

// to reverse the each word in sentence. 


public class reverseEachSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String m="";
		
		String []x=s.split(" ");
		for(int i=0; i<=x.length-1; i++)
		{
			String t=x[i];
			String rev=reverse(t);
			m=m+rev+" ";
		}
		System.out.println(m);
	}
	public static String reverse(String s) //ram
	{
		String rev=" ";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch=s.charAt(i);
			rev = rev+ch;
			
		}
		return rev;
	}

}
