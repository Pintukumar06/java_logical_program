
import java.util.Scanner;

public class evencount 
{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     int n=sc.nextInt();
     int sum=0;
     while(n>0)
     {
        int rem=n%10;
        if(rem%2==0){
            sum =sum+rem;
        }
        n=n/10;
        
     }
     if(sum%2==0)
     {
        System.out.println("it is even");
     }
     else{
        System.out.println("it is odd");
     }

 }   
}
