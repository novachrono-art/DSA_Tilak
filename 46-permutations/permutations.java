class Solution {
    List<List<Integer>> res  = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        solve(nums,0);
        return res;
    }
    public void solve(int[] nums, int ind){
          if(ind==nums.length){
            List<Integer> li =new ArrayList<>();
            for(int a:nums){
                li.add(a);
            }
            res.add(li);
          }
          for(int i=ind;i<nums.length;i++){
            swap(nums,ind,i);
            solve(nums,ind+1);
            swap(nums,i,ind);
          }

    }
    public void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}