package cn.xurongkun.lintcode.problem82;

import java.util.HashMap;
import java.util.Map;

/**
 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 */
public class Solution {
    public int singleNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer key = map.get(A[i]);
            if (key == null) {
                map.put(A[i], 0);
            } else {
                map.put(A[i], 1);
            }
        }

        for (Integer key: map.keySet()) {
            if (map.get(key) == 0) {
                return key;
            }
        }

        return 0;
    }

}
