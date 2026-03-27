class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left < right){
            int currentHeight = Math.min(height[left],height[right]);
            int currentWidth = right - left;
            int maxArea = currentHeight * currentWidth;

            result = Math.max(result,maxArea);
            if(height[left] < height[right])
                left++;
            else 
                right--;
        }
        return result;
    }
}