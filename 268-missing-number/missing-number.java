class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int missingno;
        int sum1 = n * (n+1)/2; 
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            sum2 = sum2 + arr[i];
           
        }
        missingno = sum1 - sum2;

        return missingno;
        
    }


}