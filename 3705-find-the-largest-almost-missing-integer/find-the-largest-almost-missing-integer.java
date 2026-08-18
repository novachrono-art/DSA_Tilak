class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int val=nums[i];
            mp.put(val,mp.getOrDefault(val,0)+1);   
        }
        
        if(k==1){
            int ans=-1;
            for(int i=0;i<n;i++){
                int fr = mp.get(nums[i]);
                
                
                if(fr==1) ans=Math.max(ans,nums[i]);
                
            } return ans;
        }
        if(k==n){
            int max=-1;
             for(int i=0;i<n;i++){
                int fr = mp.get(nums[i]);
                if(nums[i]>max){
                    max=nums[i];
                }
             }  
                return max;
                }
        
            int x=nums[0];
            int y=nums[n-1];
            // if(x==y) return (mp.get(x)==2) ?-1:x;
            int frx =mp.get(x);
            int fry =mp.get(y);
            if(frx==1 && fry==1){
                return Math.max(x,y);
            } 
            else if(frx==1) return x;
            else if (fry==1) return y;
            
        
        return -1;
        
    }
}