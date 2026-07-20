class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int t = m*n;
        k%=t;
        Integer[][] res = new Integer[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int ind = (i*n)+j;
                int next = (ind+k)%t;
                res[next/n][next%n]=grid[i][j];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Integer[] row:res){
            ans.add(Arrays.asList(row));
        }
        return ans;
    }
}