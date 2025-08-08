/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.*/

class Solution {
    public int maxArea(int[] height) {
        int lp = 0;                 
        int rp = height.length - 1; 
        int maxWater = 0;

        while (lp < rp) {
            int width = rp - lp;
            int minHeight = Math.min(height[lp], height[rp]);
            int waterVol = minHeight * width;

            maxWater = Math.max(maxWater, waterVol);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
}
