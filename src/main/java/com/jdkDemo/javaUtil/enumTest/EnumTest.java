package com.jdkDemo.javaUtil.enumTest;

/**
 * 枚举的测试
 *
 * @author xiaoerque
 * @create 2020-05-15-10:06
 */
public class EnumTest {

    enum Car {
        lamborghini(900,"lamborghini"), tata(2,"tata"), audi(50,"audi"), fiat(15,"fiat"), honda(12,"honda"), nanami(5211314,"nanami");

        private int price;
        private String name;

        Car(int p,String b) {
            price = p;
            name = b;
        }



        int getPrice() {
            return price;
        }
        String getName(){
            return name;
        }


    }


    public static void main(String args[]) {
        System.out.println("所有汽车的价格：");
        for (Car c : Car.values())
            System.out.println(c.getName() + " 需要 "
                    + c.getPrice() + " 千美元。---后面输出的是整个枚举:" + c);
    }

}
