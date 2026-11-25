class Solution {
    HashMap<Integer, ArrayList<Integer>> mp =new HashMap<>();
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList<>());
        }
        for(int[] arr:edges){
            int u=arr[0];
            int v=arr[1];
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
      boolean seen[] =new boolean[n];

      return help(source,destination,seen); 
   
    }

    public boolean help(int src,int des,boolean[] seen){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        if(src==des) return true;
        seen[src]=true;
        while(!q.isEmpty()){
            int rv =q.poll();
            if(rv==des) return true;
            for(int i:mp.get(rv)){
                if(!seen[i]){
                 seen[i]=true;
                 q.add(i);
                }
            }
        }
        return false;
    }
}