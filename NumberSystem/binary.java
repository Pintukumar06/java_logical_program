package NumberSystem;

import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary");
		int bin=sc.nextInt();
		binToDec(bin);
	}
	static void binToDec(int bin) {
		int p=0;
		int n=2;
		int dec=0;
		while(bin>0)
		{
			int rem=bin%10;
			int pow=(int)Math.pow(n, p);
			dec= dec+rem*pow;
			bin=bin/10;
			p++;
		}
		System.out.println(dec);
		}
}
