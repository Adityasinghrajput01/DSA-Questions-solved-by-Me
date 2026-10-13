class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int i = 0,j = nums.length-1;
        long score = 0;
        while(i<j){
            score += nums[j] - nums[i];
            i++;
            j--;
        }
        if(nums.length%2!=0)
        score = score + nums[j];
        return score;
    }
}