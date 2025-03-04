package patternProgram;

public class ass_1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++) //print spaces
			{
				System.out.print("  "); //print spaces
			}
			for(int k=1; k<=i; k++) //print * values
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
