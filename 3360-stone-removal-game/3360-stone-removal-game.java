class Solution {
    public boolean canAliceWin(int n) {
        boolean f = true;
        int z = 10;
            while(n>=z){
                n = n-z;
                z--;
                if(f==true)
                f=  false;
                else 
                f = true;
            }
        return !f;
    }
}