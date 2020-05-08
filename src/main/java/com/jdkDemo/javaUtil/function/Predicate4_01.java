package com.jdkDemo.javaUtil.function;

import com.jdkDemo.leetcode.LeedArrays;

import java.util.ArrayList;
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

        predicate.bothConditionFilter(lists, testFirst -> testFirst > 5, testEnd -> testEnd % 2 == 0);

        predicate.negateConditionFilter(lists,test-> test > 5);

        predicate.orConditionFilter(lists, test -> test > 5, testOther -> testOther < 5);

        predicate.isEqualsConditionFilter(lists, test -> test < 5);

        List<Integer> resultList = predicate.predicateList(lists,(test)-> test>5);
        resultList.forEach(System.out::print);
    }

    public void conditionFilter(List<Integer> lists, Predicate<Integer> predicate) {
        System.out.println("--------------------------");
        lists.forEach(list -> {
            if (predicate.test(list)) {
                System.out.println(list);
            }
        });
    }

    public void bothConditionFilter(List<Integer> lists,Predicate<Integer> predicateFst,Predicate<Integer> predicateEnd){
        System.out.println("------------这个表示两个判断-------------");
        lists.forEach(list->{
            if(predicateFst.and(predicateEnd).test(list)){
                System.out.println(list);
            }
        });
    }

    public void negateConditionFilter(List<Integer> lists,Predicate<Integer> predicate){
        System.out.println("------------这个表示相反-------------");
        lists.forEach(list->{
            if(predicate.negate().test(list)){
                System.out.println(list);
            }
        });
    }

    public void orConditionFilter(List<Integer> lists,Predicate<Integer> predicate,Predicate<Integer> otherPredicate){
        System.out.println("------------这个表示或者------------");
        lists.forEach(list->{
            if(predicate.or(otherPredicate).test(list)){
                System.out.println(list);
            }
        });
    }

    public void isEqualsConditionFilter(List<Integer> lists,Predicate<Integer> predicate){
        System.out.println("这里试一下isEquals------------------------");
        //一个很神奇的方法
        lists.forEach(list->{
            if(Predicate.isEqual(9).test(list)){
                System.out.println(list);
            }
        });
    }

    public List<Integer> predicateList(List<Integer> lists, Predicate<Integer> predicate) {
        System.out.println("-----------------集合经过断言获得新的集合-------------------");
        List<Integer> resultList = new ArrayList<>();
        lists.forEach(list -> {
            if (predicate.test(list)) {
                resultList.add(list);
            }
        });
        return resultList;
    }
}
