package String;

//to print duplicate characters present in the string

public class duplicatechar {
	public static void main(String[] args) {
		String s="gadag";
		char []ch=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		for(int i=0; i<=ch.length-1; i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1; j<=ch.length-1; j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1) //this condition is used to check the duplicate char are present in the string.
					System.out.println(ch[i]);
	}

}
	}
}
