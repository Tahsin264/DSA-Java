class Solution {
    public int maxAscendingSum(int[] arr) {
        int maxm = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int sum = arr[i];
            for(int j = i+1 ; j < n; j++){

                if(arr[j] <= arr[j-1]){
                    break;
                }
                sum = sum + arr[j];

               
            }
             maxm = Math.max(sum,maxm);
        }
        return maxm;
    }
}