class Solution {
    public boolean canAliceWin(int n) {
        boolean f = false;
        int z = 10;
            while(n>=z){
                n = n-z;
                z--;      
            f = !f;
            }
        return f;
    }
}