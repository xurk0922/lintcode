package cn.xurongkun.lintcode.problem384;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请找出其中无重复字符的最长子字符串。
 */
public class Solution {
    /**
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        // 保存字符以及它们最近一次出现的位置
        Map<Character, Integer> map = new HashMap<>();

        // 保存最长无重复字符串的长度
        int[] lenArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            Integer value = map.get(array[i]);

            if (value == null) {        // 没重复
                lenArr[i] = ((i == 0) ? 1: (lenArr[i-1] + 1));
            } else {        // 已经重复
                // 在这个重复的字符之前已存在的最长的无重复字符串长度
                int preLen = lenArr[i -1];
                // 开始位置1 = 当前位置 - 长度
                int aPos = i - preLen;
                // 开始位置2 = 重复位置 + 1
                int bPos = value + 1;

                if (aPos >= bPos) {
                    lenArr[i] = i - aPos + 1;
                } else {
                    lenArr[i] = i - bPos + 1;
                }
            }

            map.put(array[i], i);       // 将字符保存到map中，如果是已经存在就更新最近一次出现的位置
        }

        int max = 0;

        for (int i = 0; i < lenArr.length; i++) {
            if (lenArr[i] > max) {
                max = lenArr[i];
            }

        }

        return max;
    }
}
