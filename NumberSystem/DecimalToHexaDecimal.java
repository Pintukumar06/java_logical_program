package NumberSystem;

import java.util.Scanner;

public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal");
		int dec=sc.nextInt();
		DecToHexaDec(dec);
	}
	static void DecToHexaDec(int dec)
	{
		String hex="";
		while(dec>0)
		{
			int rem=dec%16;
			if(rem>9)
				hex=(char)(rem+55)+hex;
			
			else {
			hex=rem+hex;		
			dec=dec/16;
			}
		//System.out.println("HexaDecimal "+hex);
}
	}
}