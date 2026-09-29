class Solution {
    public int minGroups(int[][] intervals) {
      int n=intervals.length;
      int[] st = new int[n];
      int[] en = new int[n];
      for(int i=0;i<n;i++){
        st[i] = intervals[i][0];
        en[i]=  intervals[i][1];
      }  
      int k=0;
      int ct=0;
      Arrays.sort(en);
      Arrays.sort(st);
      for(int val:st){
        if(val>en[k]){
            k++;
        }
        else{
            ct++;
        }
      }
      return ct;
    }
}