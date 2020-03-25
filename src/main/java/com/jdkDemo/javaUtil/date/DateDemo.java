package com.jdkDemo.javaUtil.date;

import java.util.Calendar;
import java.util.Date;
import com.jdkDemo.utils.*;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * 测试日期
 *
 * @author xiaoerque
 * @create 2020-02-28-11:51
 */
public class DateDemo {
    public static void main(String[] args) {
        Date now = new Date();
        Date today = DateUtils.truncate(now, Calendar.DAY_OF_MONTH);
        Date yesterday = DateUtils.addDays(today, -1);
        Date lastweekfrom = DateUtils.addDays(today, -7);
        Date month = DateUtils.truncate(now, Calendar.MONTH);
        Date init = DateUtils.truncate(now, Calendar.ERA);

        /*System.out.println("输出  today:"+today);
        System.out.println("输出  yesterday:"+yesterday);
        System.out.println("输出  lastweekfrom:"+lastweekfrom);
        System.out.println("输出  month:"+month);*/
        //System.out.println("输出一下今天是本月的第几天:"+DateUtils.);
        System.out.println("输出一下初始时间:"+init);
        System.out.println("输出一下初始时间:"+DateFormatUtils.format(init,"yyyy-MM-dd hh:mm:ss"));





    }
}
