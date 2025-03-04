public class biggestno 
{
 public static void main(String[] args) {
     int a=4, b=30, c=40;
     int small = (a<b && a<c)?a:(b<c)?b:c;
     System.out.println(small+" is a small");
 }   
}
