class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }

            // finding the missing number
            
        }
        for(int index = 0; index < arr.length ; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
        
    }


}