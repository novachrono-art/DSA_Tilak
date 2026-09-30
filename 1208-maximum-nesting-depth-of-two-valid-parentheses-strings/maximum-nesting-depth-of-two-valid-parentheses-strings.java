class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int d=0;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                ans[i]=d%2;
                d++;
            }
            else{
                d--;
                ans[i]=d%2;
            }

        }
        return ans;
    }
}