class Solution {
    public int[] distributeCandies(int cand, int n) {
        int[] ans = new int[n];
        int t=1;
        while(cand!=0){
            for(int i=0;i<n;i++){
                if(cand>=t){
               ans[i]+=t;
               cand-=t;
               t+=1;
            }
            else{     
                ans[i]+=cand;
                cand=0;
                break;
            } 
            }
        }
        return ans;
    }
}