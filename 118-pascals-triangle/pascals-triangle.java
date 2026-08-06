class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r = new ArrayList<>();
            for(int j=0;j<=i;j++){
                r.add(ncr(i,j));;
            }
            l.add(r);
        }
        return l;
    }
    public int ncr(int x,int y){
        long res=1;
        for(int i=0;i<y;i++){
        res = res*(x-i);
        res = res/(i+1);
    }
    return (int) res;
    }
}