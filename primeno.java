public class primeno {
    public static void main(String[] args) {
        int n=100;
        for(int i=2; i<=n; i++)
        {
            boolean res=isPrime(i);
            if(res==true)
            System.out.println(i);
        }
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        return false;
    
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            return false;

        }
        return true;
    }
}
