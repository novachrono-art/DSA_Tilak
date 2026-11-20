class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        help(candidates,target,new ArrayList<>(),0);
        return res;
    }
    public void help(int[]arr,int t,List<Integer> li,int ind){
        if(t==0) {
            res.add(new ArrayList<>(li));
            return;
        }
       for(int i=ind;i<arr.length;i++){
        if(i>ind && arr[i]==arr[i-1]){
            continue;
        }
        if(arr[i]>t) break;
        li.add(arr[i]);
        help(arr,t-arr[i],li,i+1);
        li.remove(li.size()-1);
       }
       
    }
}