package com.jdkDemo.javaUtil.time;

import java.time.*;

/**
 * 测试时间日期
 *
 * @author xiaoerque
 * @create 2020-05-08-20:44
 */
public class DateTest {
    public static void main(String[] args) {
        testLocalDateTime();
    }

    private static void testLocalDateTime() {
        //获取当前日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间:" + currentTime);

        //获取当前日期
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1:" + date1);

        //获取当前月
        Month month1 = currentTime.getMonth();
        System.out.println("month1:" + month1 + "---val:" + month1.getValue());

        //获取当前天(月)
        int dayOfMonth1 = currentTime.getDayOfMonth();
        System.out.println("dayOfMonth1:" + dayOfMonth1);

        //获取当前天(周)
        DayOfWeek dayOfWeek1 = currentTime.getDayOfWeek();
        System.out.println("dayOfWeek1:" + dayOfWeek1 + "---val:" + dayOfWeek1.getValue());

        //获取当前秒
        int second1 = currentTime.getSecond();
        System.out.println("second1:" + second1);

        //这个方法是:设置当前日期
        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2018);
        System.out.println(date2);

        //设置年月日方法
        LocalDate date3 = LocalDate.of(2020, Month.MARCH, 25);
        System.out.println("用LocalDate.of创建的时间:" + date3);

        //设置时分秒
        LocalTime date4 = LocalTime.of(13,30,59);
        System.out.println("用LocalTime.of创建的时分秒:" + date4);

        //设置时分秒用字符串:
        LocalTime date5 = LocalTime.parse("13:30:59");
        System.out.println("用LocalTime.parse转化的时分秒" + date5);

        //设置年月日时分秒
        LocalDateTime date6 = LocalDateTime.parse("2018-05-10T13:30:59");
        System.out.println("用LocalDateTime.parse转化的日期加时间:" + date6);

        //获取时区的方法:  ZonedDateTime
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当前时区:" + currentZone);

        ZonedDateTime zoneDate1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("当前时区的日期加时间:" + zoneDate1);
    }

}
