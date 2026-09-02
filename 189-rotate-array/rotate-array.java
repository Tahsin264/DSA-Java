class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        int temp[] = new int[d];

        
        // for storing the elements which needs to be shifted by kth times in temp arr
        for(int i = n-d ; i < n; i++){
            temp[i-(n-d)] = arr[i]; 
        }

        // now shifting the elements
        for(int i = n-d-1 ; i >= 0 ; i--){
            arr[i+d] = arr[i];
        }

        // putting back the elements of temp in the correct position after shifting the rest elements which is not in the temp arr

        for (int i = 0;i < d ; i++){
            arr[i] = temp[i];
        }

    }
}