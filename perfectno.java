public class perfectno 
{
  public static void main(String[] args) {
    int n=7;
    int sum=0;
    for(int i=1; i<=n/2; i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(sum==n){
        System.out.println("perfect number");
    }
 
    else{
        System.out.println("Not a perfect number");
    }
  }   
}
