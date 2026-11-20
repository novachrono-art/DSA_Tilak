class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        help(candidates,target,new ArrayList<>(),0);
        return res;
    }
    public void help(int[]arr,int t,List<Integer> li,int ind){
        if(t==0) {
            res.add(new ArrayList<>(li));
            return;
        }
        if(ind==arr.length || t<0) return;
        if(t>=arr[ind]){
            li.add(arr[ind]);
            help(arr,t-arr[ind],li,ind);
            li.remove(li.size()-1);
        }
        help(arr,t,li,ind+1);
    }
}