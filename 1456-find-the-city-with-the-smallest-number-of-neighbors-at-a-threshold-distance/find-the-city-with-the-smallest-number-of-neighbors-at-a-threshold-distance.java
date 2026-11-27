class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer,List<int[]>> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList<>());
        }
        for(int[] e:edges){
            int src =e[0];
            int des= e[1];
            int cost = e[2];
            mp.get(src).add(new int[]{des,cost});
            mp.get(des).add(new int[]{src,cost});
        }
        int ans=0;
        int min =Integer.MAX_VALUE;
        for(int src=0;src<n;src++){
            int[] dis = new int[n];
            PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
            dis[src]=0;
            Arrays.fill(dis,Integer.MAX_VALUE);
            q.offer(new int[]{0,src});
            while(!q.isEmpty()){
                int[] curr = q.poll();
                int d =curr[0];
                int u =curr[1];

                if(d>dis[u]) continue;
                for(int[] arr: mp.get(u)){
                    int nod =arr[0];
                    int wt = arr[1];
                    if(d+wt<dis[nod]){
                        dis[nod]=d+wt;
                        q.offer(new int[]{dis[nod],nod});
                    }
                }
            }
            int ct=0;
            for(int i=0;i<n;i++){
                if(i!=src && dis[i]<=distanceThreshold){
                    ct++;
                }
            }
            if(ct<=min){
                min=ct;
                ans =src;
            }
        }
        return ans;
    }
}