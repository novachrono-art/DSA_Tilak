class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp = new HashMap<>();
        int left=0;
        int len=0;
        for(int right=0;right<fruits.length;right++){
            int val=fruits[right];
            mp.put(val,mp.getOrDefault(val,0)+1);
            if(mp.size()>2){
                int fr=fruits[left];
                mp.put(fr,mp.get(fr)-1);
                if(mp.get(fr)==0){
                    mp.remove(fr);
                }
                left++;
            }
            if(mp.size()<=2){
            len=Math.max(len,right-left+1);
            }
        }
        return len;
    }
}