package TestPrticsNumber;

import java.util.Scanner;

public class decimaltobinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int dec=sc.nextInt();
		DecToBinary(dec);
	}
	static void DecToBinary(int dec)
	{
	String bin=" ";
	while(dec>0)
	{
		int rem=dec%2;
		bin=rem+bin;
		dec=dec/2;
		
	}
	System.out.println("Binary is "+ bin);

}
}