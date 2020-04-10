package com.jdkDemo.javaUtil.function;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 对Optional的使用
 *
 * @author xiaoerque
 * @create 2020-04-08-8:59
 */
public class Optional04_08Test {

    private static int intres = 0;

    public static void main(String[] args) {
        MyStudent stu1 = new MyStudent("张三") ;
        MyStudent stu2 = new MyStudent("李四");

        MyClass cls = new MyClass();
        //cls.setMyStudents(Arrays.asList(stu1,stu2));

        Optional<MyClass> optCls = Optional.ofNullable(cls);

        List<MyStudent> result = optCls.map(MyClass::getMyStudents).orElse(null);
        if(null != result){
            result.forEach(re-> System.out.println(re.getName()));
        }


        Optional<String> optStr = Optional.of("testLove");
        optStr.ifPresent(System.out::println);
        optStr.ifPresent(strs->{
            if(strs.equals("abc")){
                intres = 1;
            }else {
                intres = -1;
            }
        });
        System.out.println("输出一个:"+intres);

    }


    @Data
  public static class MyStudent{
        private String name;

        public MyStudent(String name){
            this.name = name;
        }
    }

    @Data
    public static class MyClass{
        private List<MyStudent> myStudents;
    }
}
