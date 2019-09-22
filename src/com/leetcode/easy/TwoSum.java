package com.leetcode.easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //两数之和
    @Test
    public void test() {
        int[] nums={3,4,3,2,4};
        int target=6;
        int[] ints = twoSum2(nums, target);
        System.out.println(ints[0]+","+ints[1]);
    }

    //暴力法 直接循环遍历
    public int[] twoSum1(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){

            for(int j=(i+1);j<nums.length;j++){
                if(target==(nums[i]+nums[j])){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        throw  new IllegalArgumentException("没有两数之和等于目标值");
    }

    //两遍哈希表
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map.toString());
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                //如果complement包含在map的keys并且不等于自身，返回int数组
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
