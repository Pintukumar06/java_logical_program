package array;

import java.util.Scanner;

public class zigzag {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		int x[]=new int[size1];
		System.out.println("Enter"+size1+"element");
		for(int i=0; i<=x.length-1; i++)
		{
			x[i]=sc.nextInt();
			System.out.println("Enter the 2nd array");
			int size2=sc.nextInt();
			int y[]=new int[size2];
			System.out.println("Enter"+size2+"element");
			for(int i=0; i<=x.length-1; i++)
			{
				y[i]=sc.nextInt();
			}
			int a[]=isZigZag(x,y);
		}
		private static int [] ZigZag(int[] x,int[] y)
		{
			int z[]=new int[x.length+y.length];
			int k=0;
			for(int i=0; i<=x.length-1; i++)
			{
				if(i<x.length)
				{
					z[k]=x[i];
					k++;
					if(i<y.length)
						z[k]=y[i];
					k++;
				}
			}
		}
		return z;
	}

}
