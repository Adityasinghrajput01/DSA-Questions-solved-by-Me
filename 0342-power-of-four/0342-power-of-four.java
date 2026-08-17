class Solution {
    public boolean isPowerOfFour(int n) {
       long z = 0,f = 0;
       while(z<=n){
    if(z==n && z!=0){
        return true;
    }
    z =(long) Math.pow(4,f);
    f++;
       }
       return false;
    }
}