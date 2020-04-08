package com.jdkDemo.javaUtil.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * BinaryOperator
 *
 * @author xiaoerque
 * @create 2020-04-02-9:13
 */
public class BinaryOperator4_02 {
    public static void main(String[] args) {
        BinaryOperator4_02 binaryOperator = new BinaryOperator4_02();
        System.out.println(binaryOperator.compute(2, 3, (a, b) -> a - b));
        System.out.println(binaryOperator.compute(2, 3, (a, b) -> a * b));
        System.out.println(binaryOperator.compute(3, 3, (a, b) -> a / b));



    }

    private int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    private String getShort(String a, String b, Comparator<String> comparable) {
        return BinaryOperator.minBy(comparable).apply(a, b);
    }
}
