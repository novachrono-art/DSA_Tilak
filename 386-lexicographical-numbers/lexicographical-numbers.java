class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for(int i=1;i<=9;i++){
            help(i,n);
        }
        return li;
    }
    public void help(int num,int n){
        if(num>n){
           return;
        }
        li.add(num);
        for(int i=0;i<=9;i++){
            int n1 = num*10+i;
            if(n1>n) break;
            help(n1,n);
        }
    }
}