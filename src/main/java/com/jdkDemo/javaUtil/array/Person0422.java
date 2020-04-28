package com.jdkDemo.javaUtil.array;

import lombok.Data;

import java.util.Arrays;

/**
 * 测试一个数组
 *
 * @author xiaoerque
 * @create 2020-04-22-11:22
 */
@Data
public class Person0422 {

    private int age;
    private String name;

    public void info() {
        System.out.println(name + "的年龄是:" + age + "岁!");
    }

    public static void main(String[] args) {
        Person0422 p[] = new Person0422[5];
        Person0422 result[] = new Person0422[3];

        Person0422 stu01 = new Person0422();
        stu01.setName("张三");
        stu01.setAge(22);

        Person0422 stu02 = new Person0422();
        stu02.setName("李四");
        stu02.setAge(24);

        p[0] = stu01;
        p[1] = stu02;
        p[2] = stu01;
        p[3] = stu02;
        p[4] = stu01;

        for (int i = 0; i < p.length; i++) {
            if (null != p[i]) {
                p[i].info();
            } else {
                System.out.println("该数组的第" + i + "个下标无值!");
            }
        }

        System.out.println("--------------------------------下面开始copy");

        System.arraycopy(p,1,result,1,2);
        for (int i = 0; i < result.length; i++) {
            if (null != result[i]) {
                result[i].info();
            } else {
                System.out.println("该数组的第" + i + "个下标无值!");
            }
        }
        System.out.println("------------------------------下面进行排序");
        int[] arr = {10,9,8,6,7,5,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
