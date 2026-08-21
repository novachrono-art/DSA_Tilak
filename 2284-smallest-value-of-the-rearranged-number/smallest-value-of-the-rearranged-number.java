class Solution {
    public long smallestNumber(long num) {
        List<Long> li = new ArrayList<>();
        if(num==0) return 0;
        boolean pos = num>0;
        long temp = Math.abs(num);
        while(temp>0){
            long d = temp%10;
            li.add(d);
            temp=temp/10;;
        } 
       long ans=0;
       if(pos){
        Collections.sort(li);
        int idx=0;
        while(li.get(idx)==0){
            idx++;
        }
        Collections.swap(li,0,idx);
       for(long d:li){
        ans=ans*10+d;
       }
    }else{
        Collections.sort(li,Collections.reverseOrder());
        for(long d: li){
            ans=ans*10+d;
        }
        ans=-ans;
    }
    return ans;
    }
}