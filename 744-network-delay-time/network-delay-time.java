class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> mp =new HashMap<>();
        for(int[] t:times){
            int src = t[0];
            int des =t[1];
            int cost=t[2];
            if(!mp.containsKey(src)){
                mp.put(src,new ArrayList<>());
            }
            mp.get(src).add(new int[]{des,cost});
        }
        int[] dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[]{0,k});
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            int cost=curr[0];
            int u =curr[1];
            if(cost>dis[u]) continue;

            if(mp.containsKey(u)){
                for(int[] arr:mp.get(u)){
                    int v  =arr[0];
                    int w = arr[1];
                    if(cost+w<dis[v]){
                        dis[v]=cost+w;
                        pq.offer(new int[]{dis[v],v});
                    }
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE){
                return -1;
            }
            max=Math.max(max,dis[i]);
        }
       return max;
    }
}