class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n=nums.length;
        int cd1=Integer.MIN_VALUE;
        int cd2=Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        for(int x:nums){
            if(cd1==x){
                c1++;
            }
            else if(cd2==x){
                  c2++;
            }
            else if(c1==0){
                cd1=x;
                c1++;
            }
            else if(c2==0){
                cd2=x;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
       c1=0;
       c2=0;
       for(int i:nums){
        if(cd1==i) c1++;
        if(cd2==i) c2++;
       }
        if(c1>(n/3)) li.add(cd1);
        if(c2>(n/3)) li.add(cd2);
        return li;
    }
}