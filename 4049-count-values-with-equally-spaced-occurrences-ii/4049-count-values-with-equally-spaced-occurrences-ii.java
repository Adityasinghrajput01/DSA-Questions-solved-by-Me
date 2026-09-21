class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>>map = new HashMap<>();
        for(int i  = 0;i<nums.length;i++){
           map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i); 
        }
        int count = 0;
        for (List<Integer>pos : map.values()) {
            if (pos.size()<3)
          continue;
         int gap = pos.get(1)-pos.get(0);
            boolean s = true;
            for (int j = 2; j < pos.size(); j++) {
                int currentgap =pos.get(j)-pos.get(j-1);
                if (currentgap!=gap) {
                    s = false;
                    break;
                }
            }
            if (s==true) {
                count++;
            }
}
   return count;
    }
} 