class Solution {
    public int totalFruit(int[] fruits) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int low = 0,high=0,max = Integer.MIN_VALUE,max1 = Integer.MIN_VALUE;
        while(high<fruits.length){
        map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
        if(map.size()<=2)
        max=high-low+1;
        else {
        max1 = Math.max(max,max1);
        while (map.size() > 2) {
        int value =  map.get(fruits[low]);
        map.put(fruits[low],value-1);
        if (map.get(fruits[low])==0) {
        map.remove(fruits[low]);
        }
        low++;     
        }
        max= high-low+1;
        }
        high++;
        }
        max1 = Math.max(max, max1);
        return max1;
    }
}