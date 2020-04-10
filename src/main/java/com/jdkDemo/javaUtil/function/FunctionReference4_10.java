package com.jdkDemo.javaUtil.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 方法引用的使用
 *
 * @author xiaoerque
 * @create 2020-04-10-9:11
 */
public class FunctionReference4_10 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("bc", "bb", "ab", "ac", "bd");

        //Collections.sort(str,(str1,str2)->{return str1.compareToIgnoreCase(str2);});
        //这个方法---只是恰巧
        Collections.sort(str, String::compareToIgnoreCase);
        str.forEach(System.out::println);
    }
}
