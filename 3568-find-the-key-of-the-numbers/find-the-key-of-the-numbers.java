class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int num=0;
        int place=1;
        while(num1!=0 &&num2!=0 && num3!=0){
            int rem1=num1%10;
            int rem2=num2%10;
            int rem3=num3%10;
            rem1=Math.min(rem1,rem2);
            rem3=Math.min(rem1,rem3);
            
            num=num+(place*rem3);
            place*=10;
            num1/=10;
            num2/=10;
            num3/=10;

        }

       

        return num;
        
    }
}