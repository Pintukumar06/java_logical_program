package String;

//wap to define a method to check the user entered string is unique or not.

import java.util.Scanner;

public class checkUnique {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		if(isUnique(s))
			System.out.println("Unique");
		else
			System.out.println("Not");
	}
	public static boolean isUnique(String s)
	{
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j=i+1; j<=s.length()-1; j++)
			{
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}

}
