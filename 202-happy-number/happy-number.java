class Solution {
    public boolean isHappy(int n) {
     int slow = n;
     int fast = squareNum(n);
     while(slow != fast){
        slow  = squareNum(slow);
        fast = squareNum(squareNum(fast));
     }
     if(slow == 1){
        return true;
     }
        return false;
     }  
        private int squareNum(int n){
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans = ans + rem * rem;
            n = n/10;
        }
        return ans;
    }

    }

