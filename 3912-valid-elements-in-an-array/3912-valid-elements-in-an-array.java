class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1;i<nums.length-1;i++){
            boolean flag = check(i,nums,nums[i]);
            if(flag == true)
            list.add(nums[i]);
        }
        if(nums.length>1)
        list.add(nums[nums.length-1]);
        return list;
    }
    public boolean check(int k , int nums[],int z){
        boolean f1 =true,f2 = true ;
        for(int i=0;i<k;i++){
            if(nums[i]>=z){
                f1 = false;
                break;
            }           
        }
        if(f1==true)
        return true;
        for(int i=k+1;i<nums.length;i++){
            if(nums[i]>=z){
                f2 = false;
                break;
            }
        }
        if(f2==true)
        return true;
        return false;
    }
}