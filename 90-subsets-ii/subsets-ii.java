class Solution {
    Set<List<Integer>> s =new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        help(new ArrayList<>(),nums,0);
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> x:s){
            res.add(x);
        }
        return res;
    }
    public void help(List<Integer> li, int[]arr ,int ind){
        if(ind==arr.length){
            s.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[ind]);
        help(li,arr,ind+1);
        li.remove(li.size()-1);
        help(li,arr,ind+1);
    }
}