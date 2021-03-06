package com.jdkDemo.javaUtil.stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

/**
 * 测试关于管道的内容
 *
 * @author xiaoerque
 * @create 2020-04-30-11:36
 */
public class StreamTest002 {
    public static void main(String[] args) {

        List<Dog> listArrays = Arrays.asList(new Dog[]{new Dog("小黄", 1), new Dog("小红", 2), new Dog("小花", 3)});

        long count = listArrays.stream().filter(dog -> dog.getAge() > 1).count();

        listArrays.stream().filter(dog -> dog.getAge() >1).forEach(System.out::println);
        System.out.println(count);

        System.out.println("------下面写一个富含多个求值的方法---------");
        Stream<Integer> integerStream = Stream.iterate(1,item-> item + 1).limit(6);
        IntSummaryStatistics intSummaryStatistics = integerStream.filter(intStream->intStream>3).mapToInt(intStream->intStream*2).skip(1).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getClass());
    }
    @Data
    public static class Dog{
        private String name;
        private Integer age;

        public Dog(String name,Integer age){
            this.name = name;
            this.age = age;
        }
    }
}
