class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n==1) return true;
        for (int i=0;i<n-1;i++) {
            if (nums[i]==0) {
                boolean flag = false;
                for (int j=i-1;j>= 0;j--) {
                    if (j+nums[j]>i) {
                        flag=true;
                        break;
                    }
                }
                if(!flag)return false;
            }
        }
        return true;
    }
}