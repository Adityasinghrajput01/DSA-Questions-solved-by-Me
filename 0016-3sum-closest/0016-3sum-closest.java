class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxdif = Integer.MAX_VALUE;
        int mxsum = 0;
        for(int i =0;i<nums.length-2;i++){
            int left = i+1;
            int right  = nums.length-1;
            while(left<right){
                int sum = nums[i]+ nums[left] + nums[right];
                int diff  = Math.abs(sum-target);
                if(sum==target)
                return target;
                else if(sum<target){
                if(diff<maxdif){
                    maxdif=diff;
                    mxsum = sum;
                }
                left++;
                }
                else if(sum>target){
                    if(diff<maxdif){
                        maxdif = diff;
                        mxsum = sum;
                    }
                    right--;
                }
            }
        }
        return mxsum;
    }
}