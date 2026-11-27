class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<int[]>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] =new ArrayList<>();
        }
        for(int[] f:flights){
            adj[f[0]].add(new int[]{f[1],f[2]});
        }
        int[] price = new int[n];
        int[] stops  =new int[n];
          Arrays.fill(stops,Integer.MAX_VALUE);
        Arrays.fill(price,Integer.MAX_VALUE);
        price[src]=0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[]{0,src,0});
        while(!pq.isEmpty()){
            int[] arr =pq.poll();
            int cost = arr[0];
            int u =arr[1];
            int stop = arr[2];
            if(u==dst) return cost;
            if(stop>k) continue;

            for(int[] ad: adj[u]){
                int neig = ad[0];
                int pric =ad[1];
                int nextcost = cost+pric;
                if(stop<stops[neig] || nextcost<price[neig] ){
                     price[neig] =nextcost;
                     stops[neig]=stop;
                     pq.offer(new int[]{cost+pric,neig,stop+1});
                }
            }
        }
        return -1;
    }
}