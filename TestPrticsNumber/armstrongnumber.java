package TestPrticsNumber;

import java.util.Scanner;

public class armstrongnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		isArmStrong(n)
		static void isArmStrong(int n)
		int cd= countdigit(n);
		while(n>0)
		{
			int rem=n%10;
			power(rem.cd);
		}
	}

}
