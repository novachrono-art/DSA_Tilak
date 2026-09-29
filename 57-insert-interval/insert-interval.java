class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       List<int[]> res = new ArrayList<>();
       int i=0;
       int n=intervals.length;
       int st = newInterval[0];
       int en= newInterval[1];
       while(i<n && intervals[i][1]<st){
        res.add(intervals[i]);
        i++;
       }
       while(i<n && intervals[i][0]<=en){
           st = Math.min(st,intervals[i][0]);
           en = Math.max(en,intervals[i][1]);
           i++;
       }
       res.add(new int[]{st,en});
       while(i<n){
         res.add(intervals[i]);
         i++;
       }
       return res.toArray(new int[res.size()][]);
    }
}