/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
 */

class Solution {
    public int trap(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int lm = height[i];
            for (int j = 0; j < i; j++)
                lm = Math.max(height[j], lm);
            int rm = height[i];
            for (int j = i + 1; j < height.length; j++)
                rm = Math.max(height[j], rm);
            res += Math.min(lm, rm) - height[i];
        }
        return res;
    }
}
