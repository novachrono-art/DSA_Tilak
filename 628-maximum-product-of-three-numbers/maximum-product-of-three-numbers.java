class Solution {
    public int maximumProduct(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {    int x=nums[i];
            
            if(x>one)
              {  three=two;
                 two=one;
                 one=x;
              }
            else if(x>two)
            { three=two;
              two=x; }
            else if( x>three)
              three=x;

            if(x<min1)
            {  min2=min1;
            min1=x; }
            else if(x<min2)
               min2=x;
        }
        
        return Math.max(one*two*three, one*min1*min2); 
    }
}