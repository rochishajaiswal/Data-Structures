package Recursion;

/* Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25 */

class Solution {
  public double myPow(double x, int n) {
    return binaryExp(x, (long) n);
  }

  public double binaryExp(double x, long n) {
    if (n == 0)
      return 1.0;
    if (n == 1)
      return x;
    if (n < 0)
      return 1.0 / binaryExp(x, -n);
    else {
      if (n % 2 == 0)
        return binaryExp(x * x, n / 2);
      else
        return x * binaryExp(x * x, (n - 1) / 2);
    }
  }
}