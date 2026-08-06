class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
                   li.add(ncr(rowIndex,i));
        }
        return li;

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