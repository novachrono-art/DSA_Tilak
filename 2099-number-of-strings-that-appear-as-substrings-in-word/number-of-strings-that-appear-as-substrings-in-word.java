class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ct=0;
        for(String s : patterns){
            if(word.indexOf(s)!=-1)
               ct++;
        }
        return ct;
    }
}