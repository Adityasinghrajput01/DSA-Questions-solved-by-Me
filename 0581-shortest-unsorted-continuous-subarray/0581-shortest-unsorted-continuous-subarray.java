class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int m[] =  new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            m[i] = nums[i];
        }
        Arrays.sort(m);
        int i = 0,j=nums.length-1, count = nums.length;
        while(i<j){
            if(nums[i]==m[i]){
                i++;
                count = count-1;
            }
            else if(nums[j]==m[j]){
                j--;
                count = count-1;
            }
            else 
            break;
        }
        if(count==0 || count==1)
        return 0;
        else 
        return count;
    }
}