class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length<=1)
        return nums.length;
        int i = 0,j = i+1,count = 1;
        while(j<nums.length){
            if(nums[i]==nums[j])
            j++;
            else 
            {
                i = i+1;
                nums[i] = nums[j];
                j++;
                count++;
            }
        }
        return count;
    }
}