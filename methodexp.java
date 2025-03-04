public class methodexp 
{

  public static void factor (int a) {
      int count=0;
    for(int i=1; i<=Math.sqrt(a); i++)
    {
        if(a%i==0)
        {
            
            count++;

            if(i!=a/i){
               count++;
            }
        }
    }
    System.out.println(count);

  }


    public static void main(String[] args) {
        factor(20);
        
    }
}
