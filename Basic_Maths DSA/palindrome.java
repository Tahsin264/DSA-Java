
import java.util.Scanner;

public class palindrome {
   public palindrome() {
   }

   public static void main(String[] var0) {
      System.out.print("Enter number to reverse ");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      palindrome(var2);
   }

   static void palindrome(int var0) {
      int var1 = var0;

      int var2;
      for(var2 = 0; var0 > 0; var0 /= 10) {
         int var3 = var0 % 10;
         var2 = var2 * 10 + var3;
      }

      if (var2 == var1) {
         System.out.println("the number is palindrome");
      } else {
         System.out.println("the number is not a palindrome");
      }

   }
}
