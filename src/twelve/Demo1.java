package twelve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        /*Date----->String*/
        Date date=new Date();
        //默认的情况下日期是：Thu May 04 09:30:05 CST 2023，不符合我们日常看日期的习惯
        System.out.println(date);
        //如何符合日常日期习惯
        //固定一个日期格式对象
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //调用df的format方法：返回2023-05-04 09:30:05这种格式的日期字符串。
        String strTime=df.format(date);
        //输出转换后的字符串时间
        System.out.println(strTime);


        System.out.println("=================================");
        /*String日期---->Date*/
        //通常我们用户从前端传入日期通常是String类型，需要转换日期格式Date格式
        String str_Date="2023-05-04 09:13:00";
        //将String类型的日期转换成日期格式Date。
        Date dateTime=df.parse(str_Date);
        System.out.println(dateTime);









    }
}
