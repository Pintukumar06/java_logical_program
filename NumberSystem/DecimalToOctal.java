package NumberSystem;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal values");
		int dec=sc.nextInt();
		decToOctal(dec);
	}
	static void decToOctal(int dec)
	{
		String oct="";
		while(dec>0)
		{
			int rem=dec%8;
			oct=rem+oct;
			dec=dec/8;
		}
		System.out.println("Octal is "+oct);
	}

}
