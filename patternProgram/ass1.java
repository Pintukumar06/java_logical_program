package patternProgram;

public class ass1 {
	public static void main(String[] args) {
		int n=5; int x=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.printf("%4d",x); //%4d is used to give space b/w the digit
				x++;
			}
			System.out.println();
		}
	}

}
