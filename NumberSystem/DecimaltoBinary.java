package NumberSystem;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Values");
		int dec=sc.nextInt();
		decToBin(dec);
	}
	static void decToBin(int dec)
	{
		String bin="";
		while(dec>0)
		{
			int rem=dec%2;
			bin=rem+bin;
			dec=dec/2;
		}
		System.out.println("Binary is "+bin);
	}

}

