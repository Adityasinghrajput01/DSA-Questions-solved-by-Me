class Solution {
    public long sumAndMultiply(int n) {
        long t = 0;
        long sum = 0;
        int count =0 ;
        while(n>0){
            if(n%10!=0){
                int d = (int)Math.pow(10,count);
                count++;
                t = (d*(n%10))+t;
                sum = sum+(n%10);
            }   
            n = n/10;
        }
        return t*sum;
    }
}