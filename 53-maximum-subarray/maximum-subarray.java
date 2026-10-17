class Solution {
    public int maxSubArray(int[] nums) {
        int maxm = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            maxm = Math.max(maxm,sum);
            // if sum comes out to be less than 0 then we will reinitialize the sum to 0 and calculate the sum afterwards 
            if(sum < 0){
                sum = 0;
            }
        }
             return maxm;
        }
       
    }
