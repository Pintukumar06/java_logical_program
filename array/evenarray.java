package array;

public class evenarray {
	public static void main(String[] args) {
		int[] x=new int[4];
		x[0]=11;
		x[1]=12;
		x[2]=13;
		x[3]=14;
		for(int i=0; i<=x.length-1; i++)
		{
			if(x[i]%2==0)
			{
				System.out.println(x[i]);
			}
		}
	}
}
