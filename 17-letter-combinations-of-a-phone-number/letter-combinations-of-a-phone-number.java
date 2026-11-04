class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res= new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        String map[] ={ "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0;i<digits.length();i++){
            int dig=digits.charAt(i)-'0';
            String letters=map[dig];
            List<String> nl =new ArrayList<>();
            for(String pre: res){
                for(char ch: letters.toCharArray()){
                    nl.add(pre+ch);
                }
            }
            res=nl;
        }
        return res;
    }
}