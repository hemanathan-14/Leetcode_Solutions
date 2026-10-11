import java.util.*;


class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;

        for(int i=0;i<intervals.length;i++){
            int curend=intervals[i][1];

            while(i+1<intervals.length && curend>intervals[i+1][0]){
                count++;
                curend=Math.min(curend,intervals[i+1][1]);
                i+=1;
            }
        }
        return count;
    }
}