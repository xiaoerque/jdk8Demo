package com.jdkDemo.javaUtil.function;

import java.util.*;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> integerlists = Arrays.asList(1,3,5,7);
        List<String > stringList = Arrays.asList("猴子","至尊宝","西部大嫖客","地狱火","全息随影");
        List<String > stringList1 = Arrays.asList("i ","love ","kong ","ying ","forever");

        for (Integer i: integerlists) {
            System.out.println(i);
        }


        System.out.println("下面是lambda表达式输出-------------------");
        integerlists.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("下面是简约方式--------------------------");
        integerlists.forEach(i->{
            System.out.println(i);
        });
        System.out.println("下面是更简约的写法-------------------");
        integerlists.forEach(System.out::print);

        System.out.println();
        System.out.println("对List<object> 进行遍历");
        stringList.forEach(i->{
            System.out.println(i);
        });
        System.out.println("放入map再进行输出--------------");
        Map map = new HashMap();
        stringList.forEach(i->{
            map.put(i,i);
            System.out.println(map.get(i));
        });

        System.out.println("对Stream进行使用----------------");
        stringList1.stream().map(items -> {
            if (items.equals("kong ")) {
                items = "Kong ";
                return  items;
            }
            return items;
        }).forEach(items-> System.out.print(items));

    }
}
