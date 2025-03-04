package String;

import java.util.Scanner;

//WAJP to reverse the user entered string 
public class reverse2ndway {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string value");
		String s1=sc.nextLine();
		System.out.println(new StringBuilder(s1).reverse());
	}

}
