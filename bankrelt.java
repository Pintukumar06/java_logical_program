public class bankrelt 
{
  public static void main(String[] args) {
      double bal=10000.00;
      double amt=5000.00;
      if(amt<bal)
      {
        System.out.println("widthraw successful");
        System.out.println(bal-amt + " is balance amount");
      }
      else
      {
        System.out.println("infi balance");
      }
  }  
}
