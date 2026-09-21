class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
       map.put(i, map.getOrDefault(i, 0) + 1);
        int p  = 0 ,q = -1,r =-1,count = 0;
        while(p!=nums.length){
            if(map.get(nums[p])!=3)
            p++;
            else{
                for(int i = p+1;i<nums.length;i++){
                    if(nums[p]==nums[i] && q==-1)
                    q = i;
                    else if(nums[p]==nums[i] && r==-1){
                    r = i;
                    break;
                    }
                }
                if(q-p==r-q)
                count++;
                map.put(nums[p],1);
                q = -1;
                r =-1;
            }
        }
        return count;
    }
}