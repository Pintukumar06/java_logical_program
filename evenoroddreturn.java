public class evenoroddreturn {
    public static void main(String[] args) {
        int x=9;
        boolean res=isEvenorOdd(x);
        if(res==true)
        System.out.println("Even number");
        else
        System.out.println("Odd number");
    }
    static boolean isEvenorOdd(int n)
    {
        if(n%2==0)
        return true;
        else
        return false;

    }
}
