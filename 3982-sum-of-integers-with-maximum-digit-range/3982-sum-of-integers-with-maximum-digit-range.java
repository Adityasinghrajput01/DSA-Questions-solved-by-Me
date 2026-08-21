class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxRange = Math.max(maxRange, diff(nums[i]));
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (diff(nums[i]) == maxRange) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int diff(int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (k > 0) {
            int digit = k % 10;

            max = Math.max(max, digit);
            min = Math.min(min, digit);

            k /= 10;
        }
        return max - min;
    }
}