class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Dsu dsu = new Dsu();
        int n=edges.length;
        dsu.set(n);
        for(int[] e:edges){
            int u =e[0];
            int v=e[1];
            if(dsu.find(u)==dsu.find(v)){
                return new int[]{u,v};
            }
            dsu.union(u,v);
        }

        return new int[]{-1,-1};
    }
}
class Dsu{
    int[] par;
    int[] rank;

    public void set(int n){
        par = new int[n+1];
        rank = new int[n+1];
        for(int i=0;i<=n;i++){
            par[i]=i;
            rank[i]=0;
        }
    }

    public int find(int e){
        if(par[e]==e) return e;
        par[e]=find(par[e]);
        return par[e];
    }

    public void union(int n1,int n2){
        int p1 =find(n1);
        int p2 =find(n2);

        if(p1==p2){
            return;
        }
        if(rank[p1]==rank[p2]){
            par[p2]=p1;
            rank[p1]++;
        }
        else if(rank[p1]>rank[p2]){
            par[p2]=p1;
        }
        else{
            par[p1]=p2;
        }
    }
}