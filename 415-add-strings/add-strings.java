class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int cary=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0||j>=0||cary!=0){
            int sum=cary;
            if(i>=0){
              sum+=num1.charAt(i)-'0';
              i--;}
            if(j>=0) {sum+=num2.charAt(j)-'0'; j--;}
            s.append(sum%10);
            cary=sum/10;

        }
        return s.reverse().toString();
    }
}