class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int m[] = new int[2];
        int i = 0,j = numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target)
            {
                m[0] = i+1;
                m[1] = j+1;
                break;
            }
            else if(sum<target)
            i++;
            else 
            j--;
        }
        return m;
    }
}