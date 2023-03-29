class Solution {
    
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0,right=n-1;
        while(left<right){

           
            if(height[left] <=height[right]){
                 maxArea = Math.max(maxArea,height[left] *(right-left));
                left++;
            }
            else{
                 maxArea = Math.max(maxArea,height[right] *(right-left));
                right--;
            }
        }
        return maxArea;
    }
    
/*
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h = Math.min(height[i],height[j]);
            maxArea = Math.max(maxArea,h*(j-i));
            }
        }
        return maxArea;
    }
*/
}