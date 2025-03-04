package String;

//to defind a method to check two string are anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 string values");
		String s1=sc.nextLine(); //cat
		String s2=sc.nextLine(); //act
		
		boolean res=isAnagram(s1,s2);
		
		if(res==true)
			System.out.println("Anagram");
		else
			System.out.println("Not");
	}
	static boolean isAnagram(String s1, String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String s3=new String(ch1); // converting char array to string
		String s4=new String(ch2);// converting char array to string
		
		if(s3.equals(s4))
			return true;
		else
			return false;
		//return s3.equals(s4));(another condition from this condition we can get anagram or not).
	}

}
