class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0,j=skill.length-1;
        long sum = 0;
        int check = skill[i]+skill[j];
        while(i<j){
            if(check!=skill[i]+skill[j])
            return -1;
            int z = skill[i]*skill[j];
            sum =sum+z;
            i++;
            j--;
        }
        return sum;
    }
}