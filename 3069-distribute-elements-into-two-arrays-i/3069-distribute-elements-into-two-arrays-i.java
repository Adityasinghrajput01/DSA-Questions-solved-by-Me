class Solution {
    public int[] resultArray(int[] nums) {
       ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
       list1.add(nums[0]);
       list2.add(nums[1]);
        for(int i = 2;i<nums.length;i++){
        int last1 = list1.get(list1.size() - 1);
        int last2 = list2.get(list2.size() - 1);
        if(last1>last2){
            list1.add(nums[i]);
        }
        else
        list2.add(nums[i]);
        }
        int k = 0;
        for(int i : list1){
            nums[k] = i;
            k++;
        }
        for(int i: list2){
            nums[k] = i;
            k++;
        }
        return nums;
    }
}