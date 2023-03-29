class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0,rightMax = 0,left=0,right = n-1,total=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(leftMax<=height[left]){
                    leftMax = height[left];
                }
                else{
                    total += leftMax - height[left];
                }
                left++;
            }
            else{
                if(rightMax<=height[right]){
                    rightMax = height[right];
                }
                else{
                    total += rightMax - height[right];
                }
                right--;
            }
        }
        return total;
    }
}