package String;


//pallindrome 2nd way to check

public class pallindrome2ndWay {
	public static void main(String[] args) {
		String s1="gadag";
		String rev=new StringBuffer(s1).reverse().toString();
		if(s1.equals(rev))
			System.out.println("Pallindrome");
		else
			System.out.println("Not");
	}

}
