class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       List<Integer> li = new ArrayList<>();
       for(int i=1;i<=9;i++){
        int number=i;
        for(int j=i+1;j<=9;j++){
            number=number*10+j;
            
            if(number>=low && number<=high){
                li.add(number);
            }
       }
        
    }
    Collections.sort(li);

    return li;
}
}