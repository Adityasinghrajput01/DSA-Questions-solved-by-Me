class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int count = 0;
         StringBuilder r = new StringBuilder();
        int i = 9;
        while(count!=num){
            if(sum<i){
                i--;
            }
            else{
                sum = sum - i;
                count++;
                r.append(i);
            }
        }
        if(sum>0)
        return "";
        return r.toString();
    }
}