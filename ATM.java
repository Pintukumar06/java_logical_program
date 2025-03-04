public class ATM {
 public static void main(String[] args) 
 {
    int orgpin=1234;
    int entpin=1234;
    double bal=20000.00;
    double amt=10000.00;
    if(entpin==orgpin)
    {
        System.out.println("enter pin is correct");

    }
    if(amt<bal)
    {
        System.out.println("withdraw is successful");
        System.out.println(bal-bal+" is the balance");
    }
   else
    {
      System.out.println("inft balance");
    }
    else{
        System.out.println("invalid pin");

    }
        
    }
 }

