
import java.util.Scanner;

public class nprimeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A Number");
        int n=sc.nextInt();
        int count=0;
        int i=2;
        while(true) 
        {
            boolean rs=isPrime(i);
            if(rs==true)
            {
                System.out.println(i);
                count=count+1;

            }
            if(count==n)
            break;
            i++;

        }
        static boolean isPrime(int n)
        {
            for(int i=2; i<n; i++)
            {
                if(n%i==0)
                return false;

            }
            return true;
        }
        
    }
    
}
