class Solution {
    public boolean isBalanced(String num) {
        int even = 0,odd = 0;
        for(int i = 0 ;i<num.length();i++){
            int digit = num.charAt(i) - '0';
            if(i%2==0)
            even += digit;
            else
            odd += digit;
        }
        if(odd==even)
        return true;
        return false;
    }
}