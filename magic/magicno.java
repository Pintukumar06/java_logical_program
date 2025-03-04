package magic;

import java.util.Scanner;

public class magicno {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();
		sumOfEachDigit(n);
	}


static void sumOfEachDigit(int n)
{
	while(n>9)
	{
		int sum = 0;
	    int rem=0;
	while(n>0)
	{
		rem = n%10;
		sum = sum+rem;
		n=n/10;
	}
		n=sum;
	}
	System.out.println("Sum is " +n);
}
}

