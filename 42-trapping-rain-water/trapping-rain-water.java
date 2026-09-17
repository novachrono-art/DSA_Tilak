class Solution {
    public int trap(int[] h) {
        Stack<Integer> st = new Stack();
        int res=0;
        for(int i=0;i<h.length;i++){
           while(!st.isEmpty() && h[i]>h[st.peek()]){
             int bot = st.pop();
             if(st.isEmpty()) break;
             int left =st.peek();
             int right = i;
             int w =right-left-1;
             int wh = Math.min(h[left],h[right])- h[bot];
             res+= wh*w;
           }
           st.push(i);
        }
        return res;
    }
}