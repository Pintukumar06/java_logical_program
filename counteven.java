
import java.util.Scanner;

public class counteven 
{
    
    public static int Count(int n)
    {
        int count=0;
        int sum=0;
        while(n>0)
     {
        // int rem=n%2;
        // if(n%2==0)
        // {
        //     count++;
        // }
        // n=n/10;

       // sum of Odd Digits
        int rem=n%2;
        if(n%2!=0)
        {
            sum=sum+rem;
        }
        n=n/10;
     }
     //return count;
     return sum;
    }
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER A NUMBER");
     int n=sc.nextInt();
    // System.out.println(" Number of count is ="+Count(n));
    System.out.println(" Sum of Odd digits is ="+Count(n));
 }   
}
