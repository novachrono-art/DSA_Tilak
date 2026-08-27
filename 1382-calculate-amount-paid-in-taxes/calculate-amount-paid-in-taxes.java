class Solution {
    public double calculateTax(int[][] brackets, int income) {
        if(income==0) return (double)0;
        double res=0;
        int prev=0;
           for(int i=0;i<brackets.length;i++){
            int inc=brackets[i][0];
            int tax=brackets[i][1];
            if(income>inc){
               res+=(inc-prev)*(tax/100.0);
               prev=inc;
            }
            else{
                res+=(income-prev)*(tax/100.0);
                break;
            }
            
           }
        
        return res;
    }
}