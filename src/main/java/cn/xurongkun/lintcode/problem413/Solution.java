package cn.xurongkun.lintcode.problem413;

/**
 * 将一个整数中的数字进行颠倒，当颠倒后的整数溢出时，返回 0 (标记为 32 位整数)。
 */
public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        int result = 0;

        while (n != 0) {
            int pre = result;       // 之前的结果
            result = result * 10 + n % 10;

            n = n / 10;

            if (result / 10 != pre) {
                return 0;
            }
        }

        return result;
    }
}
