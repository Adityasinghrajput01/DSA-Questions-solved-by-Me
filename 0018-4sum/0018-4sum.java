class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
     for (int i = 0; i < nums.length - 3; i++) {
          if (i > 0 && nums[i] == nums[i - 1])
         continue;
  for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
             continue;
 long sum = nums[i] + nums[j];
        int left = j + 1;
        int right = nums.length - 1;
while (left < right) {
 long total = sum + nums[left] + nums[right];
if (total < target) {
          left++;
                    }
        else if (total > target) {
                        right--;
                    }
        else {
  List<Integer> temp = new ArrayList<>();
temp.add(nums[i]);
        temp.add(nums[j]);
    temp.add(nums[left]);
    temp.add(nums[right]);
    list.add(temp);
    left++;
    right--;
while (left < right && nums[left] == nums[left - 1])
     left++;
    while (left < right && nums[right] == nums[right + 1])
    right--;
     }
  }
    } }
        return list;
    }
}