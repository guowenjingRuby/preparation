package twelve;

import java.util.Calendar;

public class Demo2 {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        //获取年
        int year=instance.get(Calendar.YEAR);
        //获取月份
        int month = instance.get(Calendar.MONTH)+1;
        //获取天
        int day = instance.get(Calendar.DAY_OF_MONTH);
        //获取 小时
        int hour = instance.get(Calendar.HOUR_OF_DAY);
        //获取 分
        int minute = instance.get(Calendar.MINUTE);
        //获取秒
        int second = instance.get(Calendar.SECOND);

        System.out.printf("当前的时间为：%d-%d-%d %d:%d:%d",year,month,day,hour,minute,second);



    }
}
