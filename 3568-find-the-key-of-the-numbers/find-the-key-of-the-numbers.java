class Solution {
    public int generateKey(int num1, int num2, int num3) {
       String n1 =String.format("%04d",num1);
        String n2 =String.format("%04d",num2);
         String n3 =String.format("%04d",num3);
        
         int res=0;
         for(int i=0;i<4;i++){
            int p =n1.charAt(i)-'0';
            int q =n2.charAt(i)-'0';
            int r =n3.charAt(i)-'0';
            int s = Math.min(p,Math.min(q,r));
           
            res=res*10+s;
         }
         return res;
    }
}