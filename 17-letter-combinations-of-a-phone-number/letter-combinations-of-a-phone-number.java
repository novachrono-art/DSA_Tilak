class Solution {

    List<String> li =new ArrayList<>();
    String map[] ={ "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
    public List<String> letterCombinations(String digits) {
        help( digits,0,"");
        return li;
    }
    public void help(String dig,int ind,String res){
        if(ind==dig.length()){
            li.add(res);
            return;
        }
        int num=dig.charAt(ind)-'0';
        String s = map[num];
        for(int i=0;i<s.length();i++){
            help(dig,ind+1,res+s.charAt(i));
        }
    }
}