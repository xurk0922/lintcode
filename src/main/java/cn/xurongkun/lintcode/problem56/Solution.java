package cn.xurongkun.lintcode.problem56;

import java.util.HashMap;
import java.util.Map;

/**
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 1 到 n，不是以 0 开头。
 */
public class Solution {

    /**
     * 时间复杂度： O(n^2)
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{};
    }

    /**
     * 时间复杂度：O(n)
     *
     * 题目要求是两个数之和等于目标值，换一个角度思考：
     * 我拿到一个值之后，将之与目标值相减，如果数组中存在那个差，那么就找到了我需要的两个数
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < numbers.length; ++i) {
            /*
            这一部分是为了解决map无法存重复key导致相等值相加等于目标值的特殊情况
             */
            if (hash.get(numbers[i]) == null) {
                hash.put(numbers[i], i);
            } else {
                if (numbers[i] + hash.get(numbers[i]) == target) {
                    res[0] = hash.get(numbers[i]) + 1;
                    res[1] = i + 1;
                }
            }

        }

        for (int i = 0; i < numbers.length; ++i) {
            Integer value = hash.get(target - numbers[i]);
            if (value != null) {
                if (value > i) {
                    res[0] = i + 1;
                    res[1] = value + 1;
                } else {
                    res[1] = i + 1;
                    res[0] = value + 1;
                }
            }
        }

        return res;
    }
}
