package com.jdkDemo.javaUtil.lambda;

/**
 * 测试Lambda表达式
 *
 * @author xiaoerque
 * @create 2020-05-08-15:50
 */
public class LambdaTest001 {

    /**定义一个接口 当作 方法的传参*/
    interface MathOperation {
        int operation(int a, int b);
    }
    /**对MathOperation方法进行调用*/
    private static void testMathOperation(int a, int b, MathOperation mathOperation) {
        System.out.println(mathOperation.operation(a, b));
    }

    /**字符串后面连接一个字符串*/
    interface ConCatString{
        String conCatString(String str);
    }

    /**对ConCatString方法进行参数传递*/
    private static String  testConCatString(String str,ConCatString conCatString){
        return conCatString.conCatString(str);
    }

    public static void main(String[] args) {
        System.out.println("测试: 12 和 6 的加减乘除!");
        testMathOperation(12, 6, (a, b) -> {return a + b;});
        testMathOperation(12, 6, (a, b) -> a - b);
        testMathOperation(12, 6, (a, b) -> a * b);
        testMathOperation(12, 6, (int a, int b) -> a / b);


        System.out.println("中国," + testConCatString("加油", str -> str+"!"));
    }
}
