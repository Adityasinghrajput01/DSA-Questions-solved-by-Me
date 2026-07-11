class Solution {
    public int trailingZeroes(int n) {
        if(n<5)
        return 0;
     int t = 0;
    while(n>=5){
        n =(int) n/5;
        t = t+n;
    }
    return t;
    }
}