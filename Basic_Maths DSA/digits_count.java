import java.util.Scanner;

public class Digits_count {
   public Digits_count() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter the number");
      int var2 = var1.nextInt();

      int var3;
      for(var3 = 0; var2 > 0; var2 /= 10) {
         int var4 = var2 % 10;
         ++var3;
      }

      System.out.println("The number of digits in this number is :" + var3);
   }
}
