class Solution {
    public boolean equationsPossible(String[] equations) {
        Dsu dsu = new Dsu();
        dsu.set();
        for(int i=0;i<equations.length;i++){
            String s =equations[i];
            int x =s.charAt(0)-'a';
            int y=s.charAt(3)-'a';
            if(s.charAt(1)=='='){
                dsu.union(x,y);
            }
        }
        for(int i=0;i<equations.length;i++){
            String s =equations[i];
            int x =s.charAt(0)-'a';
            int y=s.charAt(3)-'a';
            if(s.charAt(1)=='!'){
                if(dsu.find(x)==dsu.find(y)){
                    return false;
                }
            }
        }
        return true;
    }
}
class Dsu{
    int[] par = new int[26];
    int[] rank =new int[26];
 
   public void set(){
     for(int i=0;i<26;i++){
        par[i]=i;
        rank[i]=0;
     }
   }
   public void union(int v1,int v2){
          int p1=find(v1);
          int p2 =find(v2);
          if(p1==p2){
             return;
          }
          if(rank[p1]==rank[p2]){
            par[p2]=p1;
            rank[p1]++;
          }
          else if(rank[p2]>rank[p1]){
                par[p1]=p2;
                rank[p2]++;
          }else{
             par[p2]=p1;
            rank[p1]++;
          }
   }
   public int find(int v){
    if(par[v]==v) return v;
    par[v] =find(par[v]);
    return par[v];
   }   

}
