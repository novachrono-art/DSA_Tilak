class Solution {
    public int findShortestCycle(int n, int[][] edges) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u =e[0];
            int v =e[1];
            li.get(u).add(v);
            li.get(v).add(u);
        }
        int min =Integer.MAX_VALUE;
        for(int st = 0;st<n;st++){
            int[] dis = new int[n];
            int[] par = new int[n];

            Arrays.fill(dis,-1);
            Arrays.fill(par,-1);
            Queue<Integer> q = new LinkedList<>();
            dis[st]=0;
            q.add(st);
            while(!q.isEmpty()){
                int u = q.poll();
                for(int v:li.get(u)){
                    if(dis[v]==-1){
                        dis[v]=dis[u]+1;
                        par[v]=u;
                        q.add(v);
                    }
                    else if(par[u]!=v){
                        min = Math.min(min,dis[u]+dis[v]+1);
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}