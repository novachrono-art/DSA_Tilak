class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long val = nums[i];
            mp.put(val,mp.getOrDefault(val,0)+1);
        }

        int ans=1;
        if(mp.containsKey((long)1)){
            int f= mp.get((long)1);
            if(f%2==0)
               ans=Math.max(ans,f-1);
            else
              ans=Math.max(ans,f);
        }

        ArrayList<Long> keys = new ArrayList<>(mp.keySet());
        for(int i=0;i<keys.size();i++){
            Long cur = keys.get(i);
            if(cur==(long)1) continue;
            Long temp=cur;
            int len =0;
            while(true){
                if(!mp.containsKey(temp) || mp.get(temp)<2){
                    break;
                }
                len+=2;
                temp=temp*temp;
            }
            if(mp.containsKey(temp)&&mp.get(temp)==1){
                len++;
            } else len--;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}