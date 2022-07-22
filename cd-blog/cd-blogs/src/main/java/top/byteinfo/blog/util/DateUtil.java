package top.byteinfo.blog.util;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {
    @SneakyThrows
    public static void main(String[] args) {
        new SimpleDateFormat("yyyy-MM-dd");
        new SimpleDateFormat("yyyy/MM/dd");
        new SimpleDateFormat("yyyy.MM.dd");
        new SimpleDateFormat("yyyy-MM-dd HH:24:mm:ss");
        new SimpleDateFormat("yyyy/MM/dd HH:24:mm:ss");
        new SimpleDateFormat("yyyy.MM.dd HH:24:mm:ss");
        new SimpleDateFormat("M/dd/yyyy");
        new SimpleDateFormat("dd.M.yyyy");
        new SimpleDateFormat("M/dd/yyyy hh:mm:ss a");
        new SimpleDateFormat("dd.M.yyyy hh:mm:ss a");
        new SimpleDateFormat("dd.MMM.yyyy");
        new SimpleDateFormat("dd-MMM-yyyy");


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = null;
        String date2 = "";

        Date e = format.parse(date1);
        Date d2 = format.parse(date2);

        boolean before = e.before(d2);
        long time = (new Date()).getTime();


    }

    public static Date getBeforeDate(String range) {
        Calendar today = Calendar.getInstance();
        if("week".equalsIgnoreCase(range)) {
            today.add(4, -1);
        } else if("month".equalsIgnoreCase(range)) {
            today.add(2, -1);
        } else {
            today.clear();
        }

        return today.getTime();
    }

    public static Date getThisWeekStartTime() {
        Calendar today = Calendar.getInstance();
        today.set(7, today.getFirstDayOfWeek());
        Calendar weekFirstDay = Calendar.getInstance();
        weekFirstDay.clear();
        weekFirstDay.set(1, today.get(1));
        weekFirstDay.set(2, today.get(2));
        weekFirstDay.set(5, today.get(5));
        return weekFirstDay.getTime();
    }

    public static String getToday(String format) {
        String result = "";

        try {
            Date today = new Date();
            SimpleDateFormat simpleFormat = new SimpleDateFormat(format);
            result = simpleFormat.format(today);
        } catch (Exception var4) {
            ;
        }

        return result;
    }

    public static Date getStartDay(int year, int month) {
        Calendar today = Calendar.getInstance();
        today.clear();
        today.set(1, year);
        today.set(2, month - 1);
        today.set(5, 1);
        return today.getTime();
    }

    public static List<Integer> getBeforeYearList(int before) {
        Calendar today = Calendar.getInstance();
        int theYear = today.get(1);
        ArrayList list = new ArrayList();

        for(int i = before; i >= 0; --i) {
            list.add(Integer.valueOf(theYear - i));
        }

        return list;
    }
//
//    public static Date getNowTime() {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        String dateStr = dateFormat(date);
//
//        try {
//            date = format.parse(dateStr);
//        } catch (ParseException var4) {
//            var4.printStackTrace();
//        }
//
//        return date;
//    }

    public static Date getTomorrow(Date date1) {
        Calendar now = Calendar.getInstance();
        now.setTime(date1);
        now.add(5, 1);
        return now.getTime();
    }

    public static Date getWeekAgo(Date date) {
        Date newDate = (Date)date.clone();
        long time = newDate.getTime() / 1000L - 604800L;
        newDate.setTime(time * 1000L);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            newDate = format.parse(format.format(newDate));
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
        }

        return newDate;
    }

//    public static Date getDatebyTime(Date date, int n) {
//        String str = dateFormat(date, "yyyy-MM-dd");
//        String[] strs = StringUtils.split(str, "-");
//        int month = Integer.parseInt(strs[1]);
//        int monthnow = (month + n) % 12;
//        int year = Integer.parseInt(strs[0]) + (month + n) / 12;
//        str = year + "-" + monthnow + "-" + strs[2];
//        return dateFormat(str, "yyyy-MM-dd");
//    }

    public static Date yesterday(Date date) {
        Date newDate = (Date)date.clone();
        long time = newDate.getTime() / 1000L - 86400L;
        newDate.setTime(time * 1000L);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            newDate = format.parse(format.format(newDate));
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
        }

        return newDate;
    }
}
