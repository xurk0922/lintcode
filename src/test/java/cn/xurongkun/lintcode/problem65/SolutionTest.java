package cn.xurongkun.lintcode.problem65;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void findMedianSortedArrays() throws Exception {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] B = {2, 3, 4, 5};

        System.out.println(solution.findMedianSortedArrays(A, B));
    }

}