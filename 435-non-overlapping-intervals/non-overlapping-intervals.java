class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));

        int pre=0;
        int ct=1;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[pre][1]){
                pre =i;
                ct++;
            }
        }
        return intervals.length-ct;
    }
}