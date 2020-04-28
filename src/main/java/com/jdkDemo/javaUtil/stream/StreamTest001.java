package com.jdkDemo.javaUtil.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 测试Stream
 *
 * @author xiaoerque
 * @create 2020-04-27-9:05
 */
public class StreamTest001 {
    public static void main(String[] args) {
        Stream<String> stream01 = Stream.of("k","y","i","love","you");

        //String[] str01 = stream01.toArray(String[]::new);
        String[] str01 = stream01.toArray(str->new String[str]);
        Arrays.asList(str01).forEach(System.out::println);
        System.out.println("---------------------------");

        Stream<Integer> stream02 = Stream.of(1,2,3,5,8);

        System.out.println(stream02.map(i-> i*2).reduce(0,Integer::sum));

        System.out.println("-----------将Stream转化为List---------------------");
        Stream<String> stream03 = Stream.of("k","y","i","love","you");
        List<String> listStream01 = stream03.collect(Collectors.toList());
        listStream01.forEach(System.out::print);

        System.out.println("-----------Integer用来调试-------------------------");
        IntStream stream04 = IntStream.of(10,87,97,43,121,20,43);
        int[] array = stream04
                .filter(intStream->intStream>10)
                .map(intStream->intStream * 2)
                .distinct()
                .sorted()
                .toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------String用来调试------------");
        Stream<String> stream05 = Stream.of("k","y","i","you","love","you","H");
        stream05.filter(str-> !str.equals("H")).distinct().sorted().forEach(System.out::println);
    }
}
