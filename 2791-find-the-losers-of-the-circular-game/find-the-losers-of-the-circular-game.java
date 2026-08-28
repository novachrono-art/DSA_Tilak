class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean win[] = new boolean[n+1];
        int curr=0;
        int s=1;
        while(!win[curr]){
            win[curr]=true;
            curr=(curr+s*k)%n;
            s++;
        }
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
           if(!win[i]) li.add(i+1);
        }
        int[] arr= new int[li.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        return arr;
        }
}