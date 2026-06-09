
import java.util.Scanner;

public class Reverse_Num {
   public Reverse_Num() {
   }

   public static void main(String[] var0) {
      System.out.println("Enter number to reverse");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      Reversenum(var2);
   }

   static void Reversenum(int var0) {
      int var1;
      for(var1 = 0; var0 > 0; var0 /= 10) {
         int var2 = var0 % 10;
         var1 = var1 * 10 + var2;
      }

      System.out.println(var1);
   }
}
