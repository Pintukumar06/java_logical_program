package array;

//to print missing element from the given element. 

public class missingElements {
	public static void main(String[] args) {
		int x[]= {5,1,8,4};
		int small=x[0], big=x[0];
		for(int i=0; i<=x.length-1; i++)
		{
			if(x[i]<small)
				small=x[i];
			if(x[i]>big)
				big=x[i];
		}
		for(int i=small; i<=big; i++)
		{
			boolean res = isMissing(i,x);
			if(res==true)
				System.out.println(i);
		}
		}
		static boolean isMissing(int n, int x[])
		{
			for(int i=0; i<=x.length-1; i++)
			{
				if(x[i]==n)
					return false;
			}
		
		return true;
	}

}
