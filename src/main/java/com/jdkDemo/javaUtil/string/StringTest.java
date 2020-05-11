package com.jdkDemo.javaUtil.string;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import java.util.function.BiFunction;

/**
 * 测试String
 *
 * @author xiaoerque
 * @create 2020-04-25-22:45
 */
public class StringTest {
    public static void main(String[] args) {
        //题目1:用compareTo/compareToIgnoreCase比较两个字符串是否相等
        testCompareTo();
        //题目2:查找字符串最后一次出现的位置
        testLastIndexOf();
        //题目2:运用BiFunction 区别:就是用BiFunction时需要在<>里面指定传参和返回的数据类型
        testLastIndexOfBiFunction();
        //题目3:删除字符串中的二个字符
        testRemoveChar();
        //题目4:替换字符串World为shawn
        testReplace();
        //题目5:字符串的反转,这个实在StringBuffer类中
        testReverse();
        //题目6:查找l个字符的下标
        testIndexOf();
        //题目7:根据-对字符串的分割
        testSplit();
    }

    interface TestFunction {
        int apply(String a, String b);
    }

    private static int testCompareTo(String a, String b, TestFunction compareTo) {
        return compareTo.apply(a, b);
    }

    private static Object testBiFunctionReturnObj(String  a, String  b, BiFunction<String,String,Object> biFunction){
        return biFunction.apply(a,b);
    }
    private static String  testBiFunctionReturnStr(String  a, Integer  b, BiFunction<String,Integer,String> biFunction){
        return biFunction.apply(a,b);
    }
    private static String  testBiFunctionAllStr(String  a, String  b, BiFunction<String,String,String> biFunction){
        return biFunction.apply(a,b);
    }
    private static Object[] testBiFunctionReturnArrayObj(String a,String b,BiFunction<String,String,Object[]> biFunction){
        return biFunction.apply(a,b);
    }

    //题目1:调用的实现方法
    private static void testCompareTo() {
        String a = "Hello World";
        String b = "hello world";
        System.out.println(testCompareTo(a, b, (lmdA, lmdB) -> { return lmdA.compareTo(lmdB); }));
        System.out.println(testCompareTo(a, b, (lmdA, lmdB) -> lmdA.compareToIgnoreCase(lmdB)));
    }

    //题目2:查找字符串最后一次出现的位置
    private static void testLastIndexOf() {
        String str = "Hello world , Hello Reader";
        String selectStr = "Hello";
        System.out.println(testCompareTo(str, selectStr, (a, b) -> a.lastIndexOf(b)));
    }

    private static void testLastIndexOfBiFunction(){
        String str = "01234567";
        String selectStr = "6";
        System.out.println("-------------------------");
        System.out.println(testBiFunctionReturnObj(str, selectStr, (a, b) -> a.lastIndexOf(b)));
    }
    //题目3:删除字符串中的二个字符
    private static void testRemoveChar(){
        System.out.println("--------------------");
        String str = "love";
        String result = testBiFunctionReturnStr(str,1,(String a, Integer b)->{
            String result1 = a.substring(0,b);
            String result2= a.substring(b+1);
            return result1.concat(result2);
        });
        System.out.println(result);
    }
    //题目4:替换字符串World为shawn
    private static void testReplace(){
        System.out.println("---------------------");
        String str = "Hello World";
        String replaceStr = "shawn";
        String  result = testBiFunctionAllStr(str,replaceStr,(a,b)->{
            return a.replace("World","shawn");
        });
        System.out.println(result);
    }
    //题目5:字符串的反转,这个实在StringBuffer类中
    private static void testReverse(){
        System.out.println("--------------------------");
        String str = "dlroW olleH";
        String result = testBiFunctionReturnStr(str,null,(a,b)->{
           StringBuffer strBuffer = new StringBuffer(a);
           return strBuffer.reverse().toString();
        });
        System.out.println(result);
    }
    //题目6:查找l个字符的下标
    private static void testIndexOf() {
        System.out.println("-------------------------");
        String str = "Hello World";
        String selectStr = "l";
        int result = (int)testBiFunctionReturnObj(str, selectStr, (a, b) -> {
            return a.indexOf(b);
        });
        System.out.println(result);
    }
    //题目7:根据-对字符串的分割
    private static void testSplit(){
        System.out.println("------------------------");
        String str = "Hello-World-Hello shawn";
        String splitStr = "-";
        String[] result = (String [])testBiFunctionReturnArrayObj(str,splitStr,(a,b)->{
            String[] resultObj = a.split(b);
            return resultObj;
        });
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

