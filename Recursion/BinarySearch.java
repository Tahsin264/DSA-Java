public class BinarySearch {
   public BinarySearch() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 3, 5, 7, 9, 13, 15, 17, 19};
      byte var2 = 1;
      int var3 = search(var1, var2, 0, var1.length - 1);
      System.out.println(var3);
   }

   static int search(int[] var0, int var1, int var2, int var3) {
      if (var2 > var3) {
         return -1;
      } else {
         int var4 = var2 + (var3 - var2) / 2;
         if (var0[var4] == var1) {
            return var4;
         } else {
            return var1 < var0[var4] ? search(var0, var1, var2, var4 - 1) : search(var0, var1, var4 + 1, var3);
         }
      }
   }
}