class Solution {
    public String reverseWords(String s) {
       StringBuilder k = new StringBuilder();
    //    k to store the answer in the end 
      int i=s.length()-1;
      while(i>=0){
        while(i>=0 && s.charAt(i)==' ') i--;
        // ye string ke end me jitna bhi space hoGA USE Remove karega
        if(i<0) break;
        // iska use imp h if string gets empty it will program will still try to access words even though string is empty
        int end=i;
        while(i>=0 && s.charAt(i)!=' ')  i--;
        // storing word in reverse order
        String word = s.substring(i+1,end+1);
        if(k.length()>0)  k.append(' ');
        k.append(word);
      }
    return k.toString();
    }
}