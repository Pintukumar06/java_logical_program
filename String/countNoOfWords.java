package String;

import java.util.Scanner;

// to count how many number of words are present in the given string.

public class countNoOfWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		    int count=0;
		for(int i=0; i<=ch.length-1; i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				count++;
		}
		System.out.println("no of words are "+count);
	}

}
