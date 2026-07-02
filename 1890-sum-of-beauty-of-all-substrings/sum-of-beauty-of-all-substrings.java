class Solution {
    public int beautySum(String s) {
         int ans=0;  
        //  isme hum end of program ans save karenge
        for(int i=0;i<s.length();i++){
            // first for loop
            int[] freq= new int[26];
            // frequency array to store frequency of characters
            for(int j=i;j<s.length();j++){
                // second for loop is for substring including index iterated by first for loop
                freq[s.charAt(j)-'a']++;
                // ascai value of a is 97 so if you subtract any character fromit you will get index of freq array
                    int max=0;
                    // to store max value
                    int min=Integer.MAX_VALUE;
                    // to store min Value;
                    // iterate array using for each loop
                    for(int k:freq){
                        if(k>0){
                           max=Math.max(max,k);
                           min=Math.min(min,k);
                        }
                    }
                    // save ans before the second iteration is about start kyoki uske baad max and min ki value change ho jayegi
                    ans+=(max-min);
            }
            
        }
        return ans;
    }
}