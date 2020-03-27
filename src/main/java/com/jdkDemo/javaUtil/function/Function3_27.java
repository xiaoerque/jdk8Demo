package com.jdkDemo.javaUtil.function;

import java.util.function.Function;

/**
 * 定义Lambda
 *
 * @author xiaoerque
 * @create 2020-03-27-9:03
 */
public class Function3_27 {
    public static void main(String[] args) {
        Function3_27 test = new Function3_27();

        System.out.println(test.computer01(4, abc -> {
            if (abc < 10) {
                return "输入的参数为:" + abc + "输出的参数小于十";
            } else {
                return "输入的参数为:" + abc + "输出的参数大于于十";
            }
        }));


    }

    private String computer01(int num, Function<Integer, String> function) {
        return function.apply(num);
    }
}
