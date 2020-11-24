package com.example.demo.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jiange
 * @date 2020/11/23 10:43
 */
public class DateUtils {
    private static SimpleDateFormat targetDateFormat = new SimpleDateFormat("yyyyMM");
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

    public static List<String> getPastMonths(String month, Integer pastMonthNum) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Date parse = targetDateFormat.parse(month);
        calendar.setTime(parse);
        calendar.add(Calendar.MONTH, -1);
        calendar.add(Calendar.MONTH, -pastMonthNum);
        List<String> pastMonthList = new LinkedList<>();
        for (int i = 0; i < pastMonthNum; i++){
            calendar.add(Calendar.MONTH, 1);
            pastMonthList.add(targetDateFormat.format(calendar.getTime()));
        }
        return pastMonthList;
    }
    public static int getDaysOfMonth(String months) throws ParseException {
        Date parse = targetDateFormat.parse(months);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static List<String> getDaysOfMonths(String month) throws ParseException {
        Date parse = targetDateFormat.parse(month);
        System.out.println(parse);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        instance.add(Calendar.DAY_OF_YEAR, -30);
        List<String> pastDaysList = new LinkedList<>();
        for (int i = 0; i < 30; i++){
            instance.add(Calendar.DAY_OF_YEAR, 1);
            pastDaysList.add(simpleDateFormat.format(instance.getTime()));
        }
        return pastDaysList;
    }

    public static void main(String[] args) throws ParseException {
        String months = "20203";
        List<String> pastMonths = getPastMonths(months, 3);
        System.out.println(pastMonths);
    }
}
