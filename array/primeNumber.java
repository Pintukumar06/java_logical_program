package array;

public class primeNumber {
	public static void main(String[] args) {
		int x[] =new int [4];
		x[0]=5;
		x[1]=8;
		x[2]=9;
		x[3]=16;
		
		System.out.println("prime elements are : ");
		for(int i=0; i<=x.length-1; i++) {
			boolean res=isPrime(x[i]);
			if(res==true) {
				System.out.println(x[i];
		}
		static boolean isPrime(int n)
		{
			if(n<=1)
				return false;
			for(int i=2; i<n; i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
	}

}
	
