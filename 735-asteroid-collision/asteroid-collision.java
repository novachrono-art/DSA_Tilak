class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n=ast.length;
        Stack<Integer> st  = new Stack<>();
        for(int val : ast){
            boolean k=false;
            while(!st.isEmpty() && st.peek()>0 && val<0){
                 if(st.peek()< -val){
                    st.pop();
                    continue;
                 } else if( st.peek()== -val){
                    st.pop();
                 }
                 k=true;
                 break;
            }
            if(!k){
                st.push(val);
            }
        }
        int arr[]= new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}