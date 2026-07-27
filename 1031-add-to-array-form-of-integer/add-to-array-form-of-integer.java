class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li = new LinkedList<>();
       int i=num.length-1;
       int cary=k;
       while(i>=0 || cary>0){
        if(i>=0){
            cary+=num[i];
            i--;
        }
        li.add(cary%10);
        cary/=10;
       }
       Collections.reverse(li);
       return li;
       
    }
}