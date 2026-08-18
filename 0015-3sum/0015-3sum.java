class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            int sum = -1*nums[i];
            if(i!=0 && nums[i]==nums[i-1])
            continue;
            while(left<right){
                if(nums[left]+nums[right]<sum)
                left++;
                else if(nums[left]+nums[right]>sum)
                right--;
                else if(nums[left]+nums[right]==sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    list.add(temp);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1] )
                    left++;
                    while(left<right && nums[right]==nums[right+1])
                    right--;
                }
            }
        }
        return list;
    }
}