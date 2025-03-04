package array;

import java.util.Scanner;

//To insert user entered number in the user entered specified index

public class insertingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int x[]=new int[size];
		System.out.println("Enter"+size+ "elements");
		for(int i=0; i<=x.length-1; i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Enter the number to insert");
		int num=sc.nextInt();
		System.out.println("Enter index to insert");
		int in=sc.nextInt();
		
		System.out.println("After inserting");
		int a[]=insert(x,num,in);
		if(a==null)
			System.out.println("invalid index");
		else
			System.out.println(Array.toString(a));
	}
	public static int[] insert(int x[], int num, int in)
	{
		if(in<0||in>x.length)
			return null;
		int y[]=new int[x.length+1];
		y[in]=num;
		for(int i=0; i<=x.length-1; i++)
		{
			if(i<in)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		
		return y;
	}

}

