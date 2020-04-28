package com.jdkDemo.javaUtil.string;

import java.util.Arrays;
import java.util.Locale;

/**
 * 测试String
 *
 * @author xiaoerque
 * @create 2020-04-25-22:45
 */
public class StringTest {
    public static void main(String[] args) {
        String firStr = "HELLO";
        String secStr = "世界";
        String result = firStr.concat(secStr);

        System.out.println(result);
        System.out.println("------------------------------");
        String formatStr = String.format(Locale.JAPANESE,result);
        System.out.println(formatStr);
    }
}
