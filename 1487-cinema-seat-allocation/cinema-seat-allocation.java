class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        HashMap<Integer,HashSet<Integer>> mp = new HashMap<>();

        for(int s[] :rs){
          mp.putIfAbsent(s[0],new HashSet<>());
          mp.get(s[0]).add(s[1]);
        }
        int ans = 2*n;
        for(HashSet<Integer> st: mp.values())
            {
            boolean l =true;
            boolean m =true;
            boolean r =true;

            for(int i=2;i<=5;i++){
                if(st.contains(i)){
                    l=false;
                    break;
                }
            }
            for(int i=4;i<=7;i++){
                if(st.contains(i)){
                    m=false;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(st.contains(i)){
                    r=false;
                    break;
                }
            }
            ans-=2;
            if(l && r) ans+=2;
            else if(l || m || r) ans+=1;
        }
        return ans;
    }
}