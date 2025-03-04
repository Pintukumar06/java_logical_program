
import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
       // scanner sc=new Scanner(System.in);
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");;
       int n=sc.nextInt();
            isArmStrong(n);
    }
}
static void isArmStrong(int n)
{
    int cd=countdigit(n);
    while(n>0)
    {
        int rem=n%10;
        int pow=power(rem,cd);
        sum=sum+pow;
        n=n/10;

    }
}
    static int power(int n,int p)
    {
        int pow=1;
        for(int i=1; i<=p; i++)
        {
            pow=pow*n;
        }
        return pow;
    }
    static int countdigit(int n)
    {
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            count=count+1;
            n=n/10;
        }
        return count;
    }
   


