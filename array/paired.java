package array;


//To print paired element who's sum is equal to given number


public class paired {
	public static void main(String[] args) {
		int x[]= {1,2,4,3,2,4};
		int num=4;
		boolean b[]=new boolean[x.length];
		for(int i=0; i<=x.length-1; i++)
		{
			for(int j=i+1; j<=x.length-1; j++)
			{
				if(x[i]+x[j]==sum)
				{
					System.out.println();
				}
			}
		}
		
	}

}
