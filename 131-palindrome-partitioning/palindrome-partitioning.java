class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res =new ArrayList<>();
        if(s.length()==0) return res;
        help(res,0,s,new ArrayList<>());
        return res;
    }
    public void help(List<List<String>> res,int ind,String s,List<String> li){
        if(ind==s.length()){
            res.add(new ArrayList<>(li));
            return;
        }
        
        for(int i=ind+1;i<=s.length();i++){
            if(pld(s,ind,i-1)){
            li.add(s.substring(ind,i));
            help(res,i,s,li);
            li.remove(li.size()-1);
            }
        }
    }
    public boolean pld(String s,int le,int ri){
        while(le<ri){
            if(s.charAt(le++)!=s.charAt(ri--)){
                return false;
            }

        }
        return true;
    }
}