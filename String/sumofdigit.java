package String;

//to print the sum of digit in the given string.

public class sumofdigit {
	public static void main(String[] args) {
		String s1="a1b2";
		int sum=0;
		for(int i=0; i<=s1.length()-1; i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
				sum=sum+ch-48; 
		}
		System.out.println(sum);
	}

}
