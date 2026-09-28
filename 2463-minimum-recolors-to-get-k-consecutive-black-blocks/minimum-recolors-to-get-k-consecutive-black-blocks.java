class Solution {
    public int minimumRecolors(String b, int k) {
        int max=0;
        int w=0;
        for(int i=0;i<k;i++){
            if(b.charAt(i)=='W'){
                w++;
            }
        }
        max=w;
        for(int i=k;i<b.length();i++){
            if(b.charAt(i)=='W') w++;
            if(b.charAt(i-k)=='W') w--;
            max=Math.min(max,w);
        }
        return max;
    }
}