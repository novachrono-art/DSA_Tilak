class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String s = Integer.toString(n);
        int sum=0;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
                sum=sum+(s.charAt(i)-'0');
            }}
            String k=sb.toString();
            int num = Integer.parseInt(k);
           if(sb.length()==0) return 0;
        return (long)num*sum;
    }
}