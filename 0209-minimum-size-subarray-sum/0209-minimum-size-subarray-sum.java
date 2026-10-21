class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0,low = 0,high = 0,min = Integer.MAX_VALUE;
        while(high<nums.length){
            if(sum<target){
            sum = sum + nums[high];
            high++;
            }
            while(sum>=target){
                min = Math.min((high-low),min);
                sum = sum - nums[low];
                low++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}