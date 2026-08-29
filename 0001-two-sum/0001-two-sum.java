class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int k=0 ,v=0;int number =0;
        for(int i = 0;i<l-1;i++)
        {
            for(int j= i+1;j<l;j++)
            {
            number = nums[i] + nums[j];
        if(number==target)
         {
        k = i;
        v = j;
         }
            }
        }
          return new int[] { k, v };
    }
}
