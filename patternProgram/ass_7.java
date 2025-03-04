package patternProgram;

public class ass_7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.println(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.println(k%2);
			}
		}
	}

}
