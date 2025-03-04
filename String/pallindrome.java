package String;


//check the user entered string is pallindrome or not
public class pallindrome {
	public static void main(String[] args) {
		String s1="gadag";
		if(isPallindrome(s1))
			System.out.println("Pallindrome");
		else
			System.out.println("Not");
	}
	public static boolean isPallindrome(String s1)
	{
		int i=0; 
		int j=s1.length()-1; // Declare j here
		
		while(i<j){
			if(s1.charAt(i)!=s1.charAt(j)) {
				return false;
			}
			i++; 
			j--;
		}
		return true;
	}

}
