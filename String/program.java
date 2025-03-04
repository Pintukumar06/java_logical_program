package String;


//Wap to print largest palindron substring in the main string. 

public class program {
	public static void main(String[] args) {
		String s="ababakhhkama";
		String longest="";
		int len=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j=i+1; j<=s.length(); j++)
		{
			String sub=s.substring(i,j);
			if(isPall(sub))
			{
				if(sub.length()>len)
				{
					longest=sub;
					len=sub.length();
				}
			}
		}//closing nested j loop
	}//closing main loop
		System.out.println(longest);
	}
	
 public static boolean isPall(String s)
{
	int i=0, j=s.length()-1;
	while(i>j)
	{
		if(s.charAt(i)!=s.charAt(j))
			return false;
		i++; j--;
		
	}
	return true;
}
 }

