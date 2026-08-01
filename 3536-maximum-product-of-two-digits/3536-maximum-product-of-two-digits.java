class Solution {
    public int maxProduct(int n) {
        int max1 = 0; int max2 = 0;
        while(n>0){
            int z = n%10;
            if(z>=max1){
            max2 = max1;
            max1= z;
            }
            else if(z>max2 && max1>z){
                max2 = z;
            }
            n = n/10;
        }
            return max1*max2;
    }
}