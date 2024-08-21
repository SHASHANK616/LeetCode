/*There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x*/

class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int val = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    val = Math.abs(i - j);
                }
                if (max < val) {
                    max = val;
                }
            }
        }
        return max;
    }
}
