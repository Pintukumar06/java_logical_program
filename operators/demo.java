package operators;

public class demo {
	public static void main(String[] args) {
		int x=21;
		int y=36;
		
		y=x++ - y-- + y++ + ++y;
		x=y++ + ++y + y++ + ++x;
		
		System.out.println(x);
		System.out.println(y);
	}

}
