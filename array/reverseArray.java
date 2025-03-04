package array;


//WAP to reverse the array element

public class reverseArray {
	public static void main(String[] args) {
		int x[]= {10,20,30,40,50};
		reverse(x);
		
		for (int num : x) {
            System.out.print(num + " ");// Print the reversed array
        } 
	}
	static int[] reverse(int x[])
	{
		int i=0; 
		int j=x.length-1; // Declare and initialize 'j'.
		
		while(i<j) // Swap elements from both ends towards the center
		{
		  int temp=x[i];
			x[i]=x[j];
			x[j]=temp; // Correctly swapping x[i] and x[j]
			i++; 
			j--;
		}
		return x;
	}

}
