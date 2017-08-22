package cn.xurongkun.lintcode.problem65;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 两个排序的数组A和B分别含有m和n个数，找到两个排序数组的中位数，要求时间复杂度应为O(log (m+n))。
 */
public class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            list.add(B[i]);
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        int size = list.size();
        if (size % 2 == 0) {
            return (list.get((size-1) / 2) + list.get((size-1) / 2 + 1)) / 2D;
        } else {
            return list.get((size-1) / 2);
        }



    }
}
