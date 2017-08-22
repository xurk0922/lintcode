package cn.xurongkun.lintcode.problem384;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        int len = solution.lengthOfLongestSubstring("gehmbfqmozbpripibusbezagafqtypz");
        System.out.println(len);
    }

}