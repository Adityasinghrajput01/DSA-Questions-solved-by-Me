class Solution {
    public int gcdOfOddEvenSums(int n) {
         int odd = n * n;
        int even = n * (n + 1);
        return gcd(odd,even);
    }
    public int gcd(int odd,int even){
        for(int i = odd;i>=1;i--){
            if(odd%i==0 && even%i==0)
            return i;
        }
        return 0;
    }
}