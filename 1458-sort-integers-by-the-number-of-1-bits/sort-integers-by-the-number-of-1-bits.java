class Solution {
    public int[] sortByBits(int[] arr) {
        Integer t[] = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            t[i]=arr[i];
        }
        Arrays.sort(t,(a,b)->{
            int ca=Integer.bitCount(a);
            int cb=Integer.bitCount(b);
            if(ca==cb) return a-b;
            return ca-cb;
        });
       for(int i=0;i<arr.length;i++){
        arr[i]=t[i];
       }
       return arr;
    }
}