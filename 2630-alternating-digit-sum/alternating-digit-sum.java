
class Solution {
    public int alternateDigitSum(int n) {
        int k=0;
        int osum=0;
        int esum=0;
        int temp=n;

        while(temp>0){
            temp=temp/10;
            k++;
        }

        int ct=0;
        while(n>0){
            int dig=n%10;
            if(ct%2==0) osum+=dig;
            else esum+=dig;
            n=n/10;
            ct++;
        }
        
        if(k%2==0) return esum-osum;
        return osum-esum;
    }
}
