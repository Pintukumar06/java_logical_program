package primeno;

public class nthprimeno {
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int i=2,count=0;
		while(true)
		{
			boolean result=isPrime(i);
			if(result==true)
			{
				System.out.println(i+"  ");
				count++;
			}
			if(count==n)
				break;
			i++;
			
		}
		static boolean isPrime(int n)
		{
			for(i=2; i<n; i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
	}

}
