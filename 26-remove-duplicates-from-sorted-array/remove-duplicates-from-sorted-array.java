class Solution {
    public int removeDuplicates(int[] arr) {
        int l = 0;
        int unique = 1;
        int h = 1;
        int n = arr.length;
        while(h < arr.length){
            if(arr[l] == arr[h]){
                h++;
                continue;
            }
            else{
             arr[l+1] = arr[h];
             h++;
             l++;
             unique++;
            }
            }
             return unique;
        }
       
    }

