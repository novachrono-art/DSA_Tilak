// class Solution {
//     public boolean isBipartite(int[][] graph) {
//     int n=graph.length;
//     Queue<Pair> q = new LinkedList<>();
//     HashMap<Integer,Integer> vis =new HashMap<>();
//     for(int i=0;i<n;i++){
//         if(!vis.containsKey(i)){
//         q.add(new Pair(i,0));
//         }
//         while(!q.isEmpty()){
//             //remove
//             Pair rv=q.poll();
//             //ignore
//            if(vis.containsKey(rv.nod)){
//              if(vis.get(rv.nod)!=rv.col) {return false;}
//              continue;
//            }

//             // mark vis
//             vis.put(rv.nod,rv.col);

//             //self work
//             for(int j:graph[rv.nod]){
//                 if(!vis.containsKey(j)){
//                     q.add(new Pair(j,1-rv.col));
//                 }
//             }

//             //add unvis
//         }
//     }
//     return true;
// }
// }
// class Pair{
//     public int nod;
//     public int col;
//     Pair(int nod,int col){
//         this.nod =nod;
//         this.col =col;
//     }
// }



class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] seen =new int[n];
        Arrays.fill(seen,-1);
        Queue<Integer> q =new LinkedList<>();
        for(int i=0;i<n;i++){
            if(seen[i]==-1){
                seen[i]=0;
                q.add(i);
                while(!q.isEmpty()){
                    int nod = q.poll();
                    
                    for(int j:graph[nod]){
                        if(seen[j]==-1){
                           seen[j]=1-seen[nod];
                           q.add(j);
                        }
                        else{
                            if(seen[j]==seen[nod]) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}