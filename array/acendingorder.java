package array;

public class acendingorder {
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6};
		boolean res=isAsc(x);
		if(res==true)
			System.out.println("ASCENDINGS");
		else
			System.out.println("not");
		
	}
	public static boolean isAsc(int x[]) //1 2 3 4 5
	{
		for(int i=0; i<=x.length-2; i++)
		{
			if(x[i]>x[i+1])
				return false;
		}
		return true;
	}

}
