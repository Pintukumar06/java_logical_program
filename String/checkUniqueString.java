package String;

// to print the unique string for given string.

public class checkUniqueString {
	public static void main(String[] args) {
		String s="abcdambhld";
		String unique="";
		int len=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j=i+1; j<=s.length(); j++)
			{
				String sub=s.substring(i,j);
				
				if(isUnqiue(sub))
				{
					if(sub.length()>len)
					{					
						len=sub.length();		
						unique=sub;
					}
				}
			}//closing nested j loop
		}//closing main i loop
		System.out.println(unique);
	}//closing main method
	public static boolean isUnqiue(String s)
	{
		for(int i=0; i<=s.length()-1; i++)
		{
			for(int j=i+1; j<=s.length()-1; j++)
			{
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}

}
