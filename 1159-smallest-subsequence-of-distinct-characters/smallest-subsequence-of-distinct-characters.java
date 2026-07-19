class Solution {
    public String smallestSubsequence(String s) {
        int[] lastind = new int[26];
        for(int i=0;i<s.length();i++){
            lastind[s.charAt(i)-'a']=i;
            // tracking index of every ch in string
        }
        boolean[] see = new boolean[26];
        Stack<Integer> st = new Stack();
    
    for(int i=0; i<s.length();i++){
        int current  = s.charAt(i)-'a';
        if(see[current]) continue;
        while(!st.isEmpty() && current<st.peek() && i<lastind[st.peek()]){
            see[st.pop()]=false;
        } st.push(current);
          see[current]=true;
    }
    StringBuilder k = new StringBuilder();
    while(!st.isEmpty()){
        k.append((char)(st.pop()+'a'));
    }
    return k.reverse().toString();
}
}