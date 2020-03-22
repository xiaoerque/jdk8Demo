package com.jdkDemo.javaUtil.function;


@FunctionalInterface
public interface FunctionIntefaceTest {

    void test();

    public class Test2{

        public void myTest(FunctionIntefaceTest functionIntefaceTest){
            System.out.println("开始------------------------");
            functionIntefaceTest.test();
            System.out.println("结束------------------------");
        }

        public static void main(String[] args) {
            Test2 test2 = new Test2();

            test2.myTest(new FunctionIntefaceTest() {
                @Override
                public void test() {
                    System.out.println("利用匿名内部类的实现!");
                }
            });

            test2.myTest(()->{
                System.out.println("简约的写法");
            });

            FunctionIntefaceTest functionIntefaceTest = () ->{

            };

            System.out.println("接口所在的位置:"+functionIntefaceTest.getClass());
            System.out.println("接口所在的父类:"+functionIntefaceTest.getClass().getSuperclass());
            System.out.println("接口的实现方法:"+functionIntefaceTest.getClass().getInterfaces()[0]);

        }
    }
}
