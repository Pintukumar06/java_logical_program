package String;

import java.util.Scanner;

//to reverse the sintence 

public class reverseSintence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String[] x=s.split(" ");
		
		String rev="";
		for(int i=x.length-1; i>=0; i--)
		{
			rev=rev+x[i]+" ";
		}
		
		System.out.println(rev);
		
	}

}
