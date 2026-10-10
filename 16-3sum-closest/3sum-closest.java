class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int gap = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            int li = i+1;
            int ri = n-1;
            while(li < ri){
            int sum = nums[i] + nums[li] + nums[ri];

            if(sum < target){
                int ngap = target - sum;
                if(ngap < gap){
                    gap = ngap;
                    res = sum;
                }
            li++;
            }
            else if(sum > target){
                int ngap = sum - target;
                if(ngap < gap){
                    gap = ngap;
                    res = sum;
                }
            ri--;
            }

            else{
                return sum;
            }

            }
    }
        return res;
    }
}