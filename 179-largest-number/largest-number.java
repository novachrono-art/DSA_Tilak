class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder s= new StringBuilder();
        List<String> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(String.valueOf(nums[i]));
        }
       Collections.sort(li,(a,b)->(b+a).compareTo(a+b));
       if(li.get(0).equals("0")) return "0";
       for(String k: li){
          s.append(k);
       } 
       return s.toString();
    }
}