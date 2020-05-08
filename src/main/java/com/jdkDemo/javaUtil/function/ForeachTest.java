package com.jdkDemo.javaUtil.function;

import java.util.Arrays;
import java.util.List;

/**
 * 测试一下forEach和判断条件
 *
 * @author xiaoerque
 * @create 2020-05-08-9:14
 */
public class ForeachTest {
    public static void main(String[] args) {
        testForeach();
    }

    private static void testForeach(){
        List<Integer> lists = Arrays.asList(1,2,3,4,5,6);
        //再lambda表达式中, 映射(map)属于中间操作, forEach输出终止操作
        lists.stream().filter(list->list>3).forEach(list-> System.out.println(list));
    }
}
