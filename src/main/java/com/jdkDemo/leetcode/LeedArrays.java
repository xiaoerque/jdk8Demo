package com.jdkDemo.leetcode;

import com.alibaba.fastjson.JSON;


/**
 * 数组题目
 *
 * @author xiaoerque
 * @create 2020-03-25-9:02
 */
public class LeedArrays {
    public static void main(String[] args) {

        System.out.println(JSON.toJSONString(twoNumAddEqualsTarget()));

    }


    /**
     * 数组中任意两个数字和等于目标值的时候输出该两个数的下标
     * */
    private static int[] twoNumAddEqualsTarget(){
        int[] nums = {2,3,5,6,8,10};
        int target = 11;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j< nums.length; j++){
                if(target == nums[j] + nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("数组中的下标没有满足目标值");
    }
}
