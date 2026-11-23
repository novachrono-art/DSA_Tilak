class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        int st=num.charAt(0)-'0';
        help(res,target,0,0,0,new StringBuilder(),num);
        return res;
    }
    public void help(List<String> res,int tar,int ind,long curr,long prev,StringBuilder s,String num){
        if(ind==num.length()){
            if(curr==tar){
            res.add(s.toString());
            }
            return;
        }
        for(int i=ind;i<num.length();i++){
            if(i>ind && num.charAt(ind)=='0') return;
            String part =num.substring(ind,i+1);
            long val =Long.parseLong(part);
               int len=s.length();

        if(ind==0){
            s.append(part);
            help(res,tar,i+1,val,val,s,num);
            s.setLength(len);
        }
        else{
   
        s.append('+').append(part);
        help(res,tar,i+1,curr+val,val,s,num);
        s.setLength(len);

        s.append('-').append(part);
        help(res,tar,i+1,curr-val,-val,s,num);
        s.setLength(len);

        s.append('*').append(part);
        help(res,tar,i+1,curr-prev+(prev*val),prev*val,s,num);
        s.setLength(len);
    }
        }
}

}