class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n<1000){
            return 0;
        }
        else{
           n = n-1000;
        }
        return n+1;
    }
}