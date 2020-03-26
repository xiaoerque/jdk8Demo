package com.jdkDemo.javaUtil.function;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * 3月26号测试
 *
 * @author xiaoerque
 * @create 2020-03-26-9:15
 */
public class Lambda3_26Test {

    private Integer varTestI = 0;

    public static void main(String[] args) {
        Lambda3_26Test test = new Lambda3_26Test();
        //test.varCanOptLambda();

        List<Integer> lists = Arrays.asList(1,2,3,6,8,9);
        List<Integer> result = test.getIntegerBig(5,lists);
        System.out.println("json为:"+ JSON.toJSONString(result));

    }


    /**
    测试一下是否可以在lambda引入变量
    */
    private void varCanOptLambda(){
        Integer inVarI = 0;
        List<Integer> lists = Arrays.asList(1,3,5,7,9);
        lists.forEach(list->{
            varTestI++;
            //inVarI++; 这个变量就不可以! why
            System.out.println("不输出集合:只输出变量i为"+varTestI);
        });
    }
    /**
    /**
    测试一下bifunction
    */

    private List<Integer> getIntegerBig(int age, List<Integer> nums) {
        BiFunction<Integer, List<Integer>, List<Integer>> biFunction = (ageParams, numsParams) -> {
            List<Integer> result = numsParams.stream().filter(numsParam -> numsParam > ageParams).collect(Collectors.toList());
            return result;
        };
        return biFunction.apply(age, nums);
    }
}
