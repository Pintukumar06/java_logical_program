package String;

import java.util.Scanner;

//to swep each word first char with last char.

public class swepfirsttolast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		int f=0;
		
		for(int i=0; i<=ch.length-1; i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') //to check it is first char or not
			{
				f=i;
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') //to check it is last char or not
			{
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		System.out.println(ch);
	}

}
