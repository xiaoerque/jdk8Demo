package com.jdkDemo.javaUtil.stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        listArrays.forEach(System.out::println);
        System.out.println(count);
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
