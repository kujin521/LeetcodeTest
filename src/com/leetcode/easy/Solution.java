package com.leetcode.easy;

import org.junit.Test;
/*
整数反转
 */
public class Solution {

    @Test
    public void Test(){
        int reverse = reverse(123);
        System.out.println(reverse);

    }


    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
