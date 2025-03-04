package array;


//wap to count how many string elements are present in the object array
public class instance {
	public static void main(String[] args) {
		Object o[]= {15.08,"ab",45,'A',20,100,98,false};
		int count=0;
		for(int i=0; i<=o.length-1; i++)
		{
			if(o[i] instanceof String) {
				count++;
			}
				
			}
			System.out.println(count);
	}

}
