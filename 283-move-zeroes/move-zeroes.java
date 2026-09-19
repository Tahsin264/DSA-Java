class Solution {
    public void moveZeroes(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }

        }

        for(int i = 0 ; i < temp.size(); i++){
            arr[i] = temp.get(i);
        }
        int k = temp.size();
        for(int i = k; i < n ; i++){
            arr[i] = 0;
        }
    }
}