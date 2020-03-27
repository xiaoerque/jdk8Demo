package com.jdkDemo.javaUtil.function;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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

        /*System.out.println(test.computer01(4, abc -> {
            if (abc < 10) {
                return "输入的参数为:" + abc + "输出的参数小于十";
            } else {
                return "输入的参数为:" + abc + "输出的参数大于于十";
            }
        }));*/

        /*System.out.println(
                "加:" + test.computer02(10, add -> new BigDecimal(add).add(new BigDecimal("3.14"))) +
                "减:" + test.computer02(10, sub -> new BigDecimal(sub).subtract(new BigDecimal("3.14"))) +
                "乘:" + test.computer02(10, mul -> new BigDecimal(mul).multiply(new BigDecimal("3.14"))) +
                "除:" + test.computer02(314, div -> new BigDecimal(div).divide(new BigDecimal("3.14")))
        );*/
        List<String> names = Arrays.asList("zhang san", "li si", "wang wu", "zhao liu");
        List<String> result = test.up(names, (nameList) -> {
            List<String> resultIn = new ArrayList<>();
            nameList.stream().forEach(name -> {
                resultIn.add(name.toUpperCase());
            });
            return resultIn;
        });
        System.out.println(result);
        System.out.println(JSON.toJSONString(result));
    }
    /**
     *最简便的写法
     */
    private String computer01(int num, Function<Integer, String> function) {
        return function.apply(num);
    }

    /**
    *写一个加减乘除运算
    * */
    private BigDecimal computer02(int num,Function<Integer, BigDecimal> function){
        return function.apply(num);
    }

    /**
    *用function对字符串转大写
    * */

    private List<String> up(List<String> names,Function<List<String>,List<String>> function){
        return function.apply(names);
    }
}
