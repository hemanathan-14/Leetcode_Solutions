class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows =matrix.length;
        int cols =matrix[0].length;
        int start=0;
        int end=rows*cols -1;
        while(start <= end){
            int m=start+(end-start)/2;
            int cura_row=m/cols;
            int cura_col=m%cols;
            if(matrix[cura_row][cura_col]==target){
                return true;
            }
            if(matrix[cura_row][cura_col]>target){
                end=m-1;
            }else{
                start=m+1;
            }
        }
        return false;
    }
}