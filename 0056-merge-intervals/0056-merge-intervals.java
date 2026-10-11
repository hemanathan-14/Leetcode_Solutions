import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int index=0;
        List<int[]> reslist=new ArrayList<>();

        while(index <intervals.length){
            int newstart=intervals[index][0];
            int curend=intervals[index][1];

            while(index<intervals.length-1 && curend>=intervals[index+1][0]){
                curend=Math.max(curend,intervals[index+1][1]);
                index++;
            }

            int newend=curend;
            reslist.add(new int[]{newstart,newend});
            index++;

        }
        index=0;
        int[][] res=new int[reslist.size()][2];
        for(int[] i:reslist){
            res[index++]=i;
        }
        return res;
    }
}