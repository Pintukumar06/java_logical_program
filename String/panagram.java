package String;

import java.util.HashSet;
import java.util.Scanner;

// WAJP to defined to check the given string panagram or not.

public class panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		
		if(isPanagram(s))
			System.out.println("Panagram");
		else
			System.out.println("Not a Panagram");	
	}
	public static boolean isPanagram(String s)
	{
		s=s.toLowerCase();
		if(s.length()<26)
			return false;
		
		HashSet hs=new HashSet();
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
				hs.add(ch);
		}
		return hs.size()==26;
	}
	

}
