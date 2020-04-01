package com.jdkDemo.javaUtil.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 对predicate的使用
 *
 * @author xiaoerque
 * @create 2020-04-01-9:03
 */
public class Predicate4_01 {
    public static void main(String[] args) {
        //定义一个被断言确认的集合
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate4_01 predicate = new Predicate4_01();

        predicate.conditionFilter(lists, test -> test > 5);
        predicate.conditionFilter(lists, test -> test % 2 == 0);
        predicate.conditionFilter(lists, test -> test % 2 != 0);
    }

    public void conditionFilter(List<Integer> lists, Predicate<Integer> predicate) {
        System.out.println("--------------------------");
        lists.forEach(list -> {
            if (predicate.test(list)) {
                System.out.println(list);
            }
        });
    }
}
