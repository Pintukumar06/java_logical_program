package array;

// To print occurance or frequency of each element

public class occuranceORFrequency {
	public static void main(String[] args) {
		int x[]= {10,20,30,10,20};
		boolean b[]=new boolean[x.length];
		for(int i=0; i<=x.length-1; i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1; j<=x.length-1; j++)
				{
					if(x[i]==x[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(x[i]+ " "+count);
			}
		}
	}

}
