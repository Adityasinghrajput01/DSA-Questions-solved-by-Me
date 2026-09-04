class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int diff = 0, min =k+1,z = 0,index = -1;
        for(int i = 0;i<nums.length;i++){
             diff = findindex(nums,i);
             if(k>=diff){
             z=diff;
             return i;
             }
        }
        return index;
    }
    public int findindex(int nums[], int i){
        int min =Integer.MAX_VALUE,max = -1;
        for(int j = 0;j<=i;j++){
            if(max<nums[j])
            max = nums[j];
        }
        for(int j = i;j<nums.length;j++){
            if(min>nums[j])
            min = nums[j];
        }
        return max-min;
    }

}