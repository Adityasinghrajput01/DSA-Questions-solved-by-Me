class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
                int l = intervals.length;
        for(int i = 0;i<intervals.length;i++){
            int a = intervals[i][0];
             int b = intervals[i][1];
            for(int j = 0;j<intervals.length;j++){
                int c = intervals[j][0];
                int d = intervals[j][1];
                if(c<=a && b<=d && j!=i){
                    l--;
                    break;
                }
            }
        }
        return l;

    }
}