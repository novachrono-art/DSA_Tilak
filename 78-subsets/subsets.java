class Solution {
    List<List<Integer>> res =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        help(new ArrayList<>(),nums,0);
        return res;
    }
    public void help(List<Integer> li,int[] arr, int ind){

        if(ind==arr.length){
            res.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[ind]);
        help(li,arr,ind+1);
        li.remove(li.size()-1);
        help(li,arr,ind+1);
    }
}