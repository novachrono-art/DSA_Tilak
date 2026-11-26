class Solution {
    public int findCircleNum(int[][] ic) {
        int n=ic.length;
        List<List<Integer>> li =new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ic[i][j]==1){
                    li.get(i).add(j);
                }
            }
        }
        int ct=0;
        boolean vis[] = new boolean[n];
        Queue<Integer> q  = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ct++;
                vis[i]=true;
                q.add(i);
                while(!q.isEmpty()){
                    int rv =q.poll();
                    for(int j:li.get(rv)){
                        if(!vis[j]){
                            q.add(j);
                            vis[j]=true;
                        }
                    }
                }
            }
        }
        return ct;
    }
}