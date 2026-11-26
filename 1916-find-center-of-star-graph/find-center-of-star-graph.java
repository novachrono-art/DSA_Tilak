class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        List<List<Integer>> li = new ArrayList<>(n+1);
        for(int i=0;i<=n;i++){
            li.add(new ArrayList<>());
        }
        for(int[] arr:edges){
            int i =arr[0];
            int j=arr[1];
            li.get(i).add(j);
            li.get(j).add(i);
        }
        int len =edges.length;
        int ans=-1;
        for(int i=1;i<=n;i++){
            if(li.get(i).size()==len) ans=i;
        }
        return ans;
    }
}