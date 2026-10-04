import java.util.Stack;
class Solution {
    public int trap(int[] height) {
        int leftmax=height[0];
        Stack <Integer> rightmax=new Stack();

        rightmax.push(height[height.length-1]);

        for(int i=height.length-1;i>=2;i--){
            int temp=Math.max(rightmax.peek(),height[i]);
            rightmax.push(temp);
        }
        int water=0;

        for(int i=1;i<height.length-1;i++){
            int mini=Math.min(leftmax,rightmax.peek());
            int temp=mini-height[i];
            water+=Math.max(0,temp);

            rightmax.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return water;
    }
}