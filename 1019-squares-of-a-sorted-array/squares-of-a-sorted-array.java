class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
                } 
            else{
                pos.add(nums[i]);
            }
            }
            int[] mainarr = new int[neg.size() + pos.size()];

            if(neg.size()==0){
                for(int i = 0;i<pos.size();i++){
                    mainarr[i] = pos.get(i) * pos.get(i);
                    
                }
                return mainarr;
            }

            if(pos.size() == 0){
                for(int i = 0; i < neg.size();i++){
                    mainarr[i] = neg.get(i) * neg.get(i);

                }
                 reverse(mainarr,0,mainarr.length - 1);
                 return mainarr;
            }
            
            int n = neg.size();
            int m = pos.size();
            int i = 0; int j = 0;
            int id = 0;

            // square negatives and reverse them 
            int negSquares[] = new int[n];
            for(i = 0;i<n;i++){
                 negSquares[i] = neg.get(i) * neg.get(i);
            }

            reverse(negSquares,0,n-1);
            int posSquares[] = new int[m];
            for(i=0; i< m; i++){
               posSquares[i] = pos.get(i) * pos.get(i);
                
            }

            i = 0;
            j = 0;

            while(i<n && j<m){
                if(negSquares[i] <=posSquares[j]){
                    mainarr[id] = negSquares[i];
                    id++;
                    i++;
                }
                else{
                    mainarr[id] = posSquares[j];
                    id++;
                    j++;

                }
            }

            while(i < n){
                mainarr[id] = negSquares[i];
                i++;
                id++;
            }

             while(j < m){
                mainarr[id] = posSquares[j];
                j++;
                id++;
            }

            return mainarr;
        }

        public static int[] reverse(int arr[], int s, int e){
            while(s < e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            return arr;
        }
    
}