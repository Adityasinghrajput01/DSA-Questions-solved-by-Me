class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0 ;i<s.length();i++){
            int num = (int)s.charAt(i);
            num = 123 - num;
            sum = sum+(num*(i+1));
        }
        return sum;
    }
}