package String;

//to sort the string char into asading char.

public class sortingchar {
	public static void main(String[] args) {
		String s="krishna";
		char[]ch=s.toCharArray();
		for(int i=0; i<=ch.length-1; i++)
		{
			for(int j=i+1; j<=ch.length-1; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		String s1=new String(ch);
		System.out.println(ch);
	}

}
