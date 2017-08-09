package cn.xurongkun.lintcode.problem56;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    private int[]  numbers = {1, 1, 3, 4};
    @Test
    public void twoSum() throws Exception {
        int[] res = solution.twoSum(numbers, 3);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }

    @Test
    public void twoSum2() throws Exception {
        int[] res = solution.twoSum(numbers, 2);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}