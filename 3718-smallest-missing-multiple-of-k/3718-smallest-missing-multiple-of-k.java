class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        map.put(i,map.getOrDefault(i,0)+1);
        int  i = 1;
        int z = k;
        while(true){
            if(map.containsKey(k)){
                i++;
                k = z*i;

            }
            else
            return k;

        }
    }
}