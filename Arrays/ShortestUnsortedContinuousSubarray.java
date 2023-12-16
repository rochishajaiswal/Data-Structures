import java.util.ArrayList;
import java.util.Arrays;

/*Given an integer array nums, you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.

Return the shortest such subarray and output its length.

 

Example 1:Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Example 2:

Input: nums = [1,2,3,4]
Output: 0 
*/

/* Solution 1 */

class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int dup[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            dup[i] = arr[i];
        }
        Arrays.sort(dup);
        for (i = 0; i < n; i++) {
            if (arr[i] != dup[i]) {
                break;
            }
        }
        for (j = n - 1; j >= 0; j--) {
            if (arr[j] != dup[j]) {
                break;
            }
        }
        for (int k = i; k <= j; k++) {
            ans.add(arr[i]);
        }
        return ans.size();

    }
}
