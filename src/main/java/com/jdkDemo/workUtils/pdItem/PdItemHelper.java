package com.jdkDemo.workUtils.pdItem;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 测试一个方法
 *
 * @author xiaoerque
 * @create 2020-04-01-13:23
 */
public class PdItemHelper {
    public static void main(String[] args) {
        PdItemHelper helper = new PdItemHelper();
        Collection<String > collection = helper.spliteBySpace("I love you \\s|，|, | loveSoMuch");
        System.out.println(collection.size());
        collection.forEach(System.out::print);
    }

    public Collection<String> spliteBySpace(String str){
        if(StringUtils.isEmpty(str)){
            return null;
        }
        String[] strsArr = str.split("\\s|，|,");
        Set<String> resultSet = new LinkedHashSet<>();
        for (String s : strsArr) {
            s = StringUtils.trimToNull(s);
            if(StringUtils.isNotBlank(s)){
                resultSet.add(s);
            }
        }
        return resultSet.size()>0 ? resultSet : null;
    }
}
