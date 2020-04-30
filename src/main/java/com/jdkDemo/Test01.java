package com.jdkDemo;

/**
 * 斐波那契
 *
 * @author xiaoerque
 * @create 2020-04-30-16:14
 */
public class Test01 {
    public static void main(String[] args) {
        int num = 4;
        if (num < 0)
            System.out.println("错误");
        else {

            int currentFib = 0, nextFib = 1, temp;

            for (int i = 1; ; i++) {
                temp = nextFib;
                nextFib = currentFib + nextFib;
                currentFib = temp;
                if (num <= currentFib) break;
            }

            if ((num == currentFib))
                System.out.println("是");
            else
                System.out.println("否");
        }
    }
}
