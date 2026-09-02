class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0,even = 0;
        boolean f = false;
        for(int i : nums1){
            if(i%2==0)
            even += 1;
            else 
            odd += 1;
        }
        if(even>odd)
      f = transformEven( nums1);
        else 
      f = transformOdd( nums1); 
        return true;
    }
    public boolean transformEven(int[] nums){
         int flag = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                flag += 1;
                continue;
            }
            else{
           for(int j=0;j<nums.length;j++){
            if(i!=j){
                int k = nums[i] - nums[j];
                if(k%2==0)
                {
                    flag++;
                    break;
                }
            }
           }
        }
        }
         if(flag==nums.length)
        return true;
        return false;
    }
 public boolean transformOdd(int[] nums){
         int flag = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2!=0){
                flag += 1;
                continue;
            }
            else{
           for(int j=0;j<nums.length;j++){
            if(i!=j){
                int k = nums[i] - nums[j];
                if(k%2!=0)
                {
                    flag++;
                    break;
                }
            }
           }
        }
        }
         if(flag==nums.length)
        return true;
        return false;
    }
}