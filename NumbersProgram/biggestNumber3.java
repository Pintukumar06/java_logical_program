package NumbersProgram;

//to find the biggest number among these

public class biggestNumber3 {
	public static void main(String[] args) {
		int x=60, y=20, z=40;
		int big = x;
		
		if(y>big)
			big=y;
		if(z>big)
			big=z;
		System.out.println(big);
	}

}
