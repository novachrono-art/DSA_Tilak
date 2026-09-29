class Solution {
    public int[][] merge(int[][] arr) {
            Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
            List<int[]> res= new ArrayList<>();
            for(int a[]:arr){
                if(!res.isEmpty() && a[0]<=res.get(res.size()-1)[1]){
                    res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],a[1]);
                }
                else{
                  res.add(a);
                }
            }
            return res.toArray(new int[res.size()][]);
        }
    }