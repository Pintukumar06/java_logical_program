package String;

import java.util.Scanner;

//to convert upper case char into lower or lower case into upper case.

public class checkUpperOrLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for(int i=0; i<=ch.length-1; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
			else if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			
		}
		System.out.println("After converting ");
		System.out.println(ch);
	}

}

