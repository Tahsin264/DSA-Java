class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0 ){
                ans[pos] = arr[i];
                pos = pos+2;
            }
            else if(arr[i]<0){
                ans[neg] = arr[i];
                neg = neg + 2;
            }
        }
        return ans;
    }
}