package com.jdkDemo.javaUtil.varArgs;

/**
 * 连续的参数 可用于集合的接收
 *
 * @author xiaoerque
 * @create 2020-05-16-9:35
 */
public class TestVariableArguments {
    public static void main(String[] args) {
        int[] arr = {3,5,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("相加为:"+sumWithVariableArgument(arr));
    }

    private static int sumWithVariableArgument(int ... varArgs){
        int sum = 0;
        for (int i = 0; i < varArgs.length; i++) {
            sum += varArgs[i];
        }
        return sum;
    }
}
