package com.jdkDemo.javaUtil.array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

/**
 * Array熟悉类
 *
 * @author xiaoerque
 * @create 2020-02-16-23:38
 */
public class ArrayDemo {
    //用于forEach中的计数
    private static Integer TEST_SORT_I = 0;
    public static void main(String[] args) {
        //题目1:数组排序  查出2所在的位置
        testSort();

        
    }

    private static Object[] testBiFunctionInteger(Object[] fir, Object[] sec, BiFunction<Object[],Object[],Object[]> biFunction){
        return biFunction.apply(fir,sec);
    }

    //题目1:数组排序  查出2所在的位置
    private static void testSort(){
        System.out.println("-----------------------");
        Integer array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Object result[] = testBiFunctionInteger(array,null,(a,b)->{
            Arrays.sort(a);
            return a;
        });
        List lists = Arrays.asList(result);
        lists.forEach(item->{
            if(null != item && TEST_SORT_I != 0){
                System.out.print(",");
            }
            System.out.print(item);
            TEST_SORT_I++;
        });
        System.out.println();
        System.out.println("元素2所在的下标为:" +Arrays.binarySearch(result,2));
    }
}
