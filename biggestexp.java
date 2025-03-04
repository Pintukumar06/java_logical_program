public class biggestexp 
{
 public static void main(String[] args) {
     int a=50, b=70, c=30, d=90;
     int big=(a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
     System.out.println(big);
 }   
}
