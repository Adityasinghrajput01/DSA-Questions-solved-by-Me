class Solution {
    public int integerBreak(int n) {
        int p = 1;
        if(n==2)
        return 1;
        else if(n==3)
        return 2;
        else{
            while(n>4){
              p = p*3  ;
              n = n-3;
            }
            return p*n;
        }
    }
}