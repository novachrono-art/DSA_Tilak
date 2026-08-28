class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int s1=score(p1);
        int s2=score(p2);
        
        if(s1>s2) return 1;
        if(s2>s1) return 2;
        return 0;
    }
    private int score(int[] arr){
        int res=0;
        int idx=-3;
        for(int i=0;i<arr.length;i++){
            if(i-idx<=2){
                res+=2*arr[i];
            } else{
                res+=arr[i];
            }
            if(arr[i]==10) idx=i;
        }
       return res;
    }
}