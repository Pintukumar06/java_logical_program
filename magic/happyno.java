package magic;

import java.util.Scanner;

public class happyno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(isHappy(n));
		{
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not Happy Number");
		}
	}

}
static boolean isHappy(int n)
{
	while(n>9)
	int sum=0;
	int rem=0;
	while(n>0)
	{
		rem=n%10;
		sum = sum + rem*rem;
		n=n/10;
	}
	n=sum;
}
