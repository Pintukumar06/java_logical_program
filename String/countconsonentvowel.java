package String;

//count how many consonent and vowel are present in the given string.

public class countconsonentvowel {
	public static void main(String[] args) {
		String s1="pintu@123";
		int cc=0, vc=0;
		for(int i=0; i<=s1.length()-1; i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					vc++;
				else
					cc++;
			}
			
		}
		System.out.println("consonent counts are "+cc);
		System.out.println("vowel counts are "+vc);
	}

}
