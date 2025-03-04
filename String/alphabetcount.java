package String;

// to count the how many alphabet,digit,special char are present in the given string.

public class alphabetcount {
	public static void main(String[] args) {
		String s1="abcd@12";
		int ac=0, dc=0, sc=0;  //ac-- alphabet count, dc--digit count, sc--special count
		for(int i=0; i<=s1.length()-1; i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
				ac++;
			else if(ch>='0' && ch<='9')
				dc++;
				else
					sc++;
		}
		System.out.println("alphabetcal char "+ac);
		System.out.println("Digit count "+dc);
		System.out.println("Special count "+sc);
	}

}
