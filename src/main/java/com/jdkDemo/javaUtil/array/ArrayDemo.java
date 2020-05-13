package com.jdkDemo.javaUtil.array;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.security.cert.TrustAnchor;
import java.util.*;
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
        //题目2:数组的合并
        addAll();
        //题目3:数组填充(是填充 有多大就填充多少个,有值的话直接覆盖)
        testFill();
        //题目4:数组的差集/交集/并集
        testRemoveAndRetainAndUnion();

    }

    private static Object[] testBiFunctionObjArray(Object[] fir, Object[] sec, BiFunction<Object[],Object[],Object[]> biFunction){
        return biFunction.apply(fir,sec);
    }
    private static Boolean testBiFunctionList(List list1, List list2, BiFunction<List,List,Boolean> biFunction){
        return biFunction.apply(list1,list2);
    }
    //题目1:数组排序  查出2所在的位置
    private static void testSort(){
        System.out.println("-----------------------");
        Integer array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Object result[] = testBiFunctionObjArray(array,null,(a,b)->{
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

    //题目2:数组的合并
    private static void addAll(){
        System.out.println("-------------------------------");
        String str1[] = {"Hello", "World"};
        String str2[] = {"HelloWorld","HelloShawn"};
        List list1 = new ArrayList(Arrays.asList(str1));
        List list2 = Arrays.asList(str2);
        testBiFunctionList(list1,list2,(a,b)->{
            boolean result = a.addAll(b);
            a.forEach(System.out::println);
            return result;
        });
    }
    //题目3:数组填充(是填充 有多大就填充多少个,有值的话直接覆盖)
    private static void testFill(){
        System.out.println("----------------------");
        String str1[] = {"Hello", "World", "Hello"};
        Object result[] = testBiFunctionObjArray(str1,null,(a,b)->{
            Arrays.fill(a,"shawn");
            return a;
        });
        List resultList = new ArrayList(Arrays.asList(result));
        resultList.forEach(System.out::println);
    }
    //题目4:数组的差集/交集/并集
    private static void testRemoveAndRetainAndUnion(){
        System.out.println("---------------------------");
        //数组的差集和交集可用用ArrayList中的remove和retain的方法 如果求并集,可用用set集合对两个数组去重
        String[] str1 = {"hello","world","shawn"};
        String[] str2 = {"hello","宝宝"};
        List listOut1 = new ArrayList(Arrays.asList(str1));
        List listIn1 = new ArrayList(Arrays.asList(str1));
        List listOut2 = new ArrayList(Arrays.asList(str2));
        List listIn2 = new ArrayList(Arrays.asList(str2));
        listOut1.removeAll(listOut2);
        System.out.println("两个数组的差集为:"+listOut1);
        listIn1.retainAll(listIn2);
        System.out.println("两个数组的交集为:"+listIn1);

        Object[] result = union(str1,str2);
        System.out.print("两个数组的并集为:");
        Arrays.asList(result).forEach(System.out::print);
    }
    //定义方法查询两个数组中元素的并集
    private static Object[] union(Object[] str1, Object[] str2) {
        ArrayList list = new ArrayList(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));
        Set set = new HashSet();
        list.forEach(item->{
            set.add(item);
        });
        return set.toArray();
    }
}
