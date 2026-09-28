class Solution {
    public int captureForts(int[] forts) {
        int fort=0;
        int ct=-1;
        for(int i=0;i<forts.length;i++){
            if(forts[i]!=0){
                if(ct!=-1 && forts[i]!=forts[ct]){
                    fort=Math.max(fort,i-ct-1);
                }
                ct=i;
            }
        }
        return fort;
    }
}