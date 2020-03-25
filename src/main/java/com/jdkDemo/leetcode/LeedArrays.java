package com.jdkDemo.leetcode;

import com.alibaba.fastjson.JSON;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/**
 * 数组题目
 *
 * @author xiaoerque
 * @create 2020-03-25-9:02
 */
public class LeedArrays {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,8,10};
        int target = 11;
        int[] abc = targetAddNums(nums,target);
        System.out.println(JSON.toJSONString(abc));
    }

    private static int[] targetAddNums(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j= i; j<nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("数组中没有目标值!");
    }
}
