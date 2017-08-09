package cn.xurongkun.lintcode.problem53;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 */
public class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length-1; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
