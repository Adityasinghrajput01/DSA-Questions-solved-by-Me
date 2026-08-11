class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = nums[0];
        int prev = nums[0];
        boolean c = true;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (i == 0)
                continue;
            if (c && nums[i] == prev + 1) {
                sum += nums[i];
            } else {
                c = false;
            }
            prev = nums[i];
        }
       while (set.contains(sum))
            sum++;
        return sum;
    }
}