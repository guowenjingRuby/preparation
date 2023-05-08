package third;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 16:17
 */
public class TestCompetition {
    public static void main(String[] args) {
        Competition competition=new Competition();
        //定义一个长度为5类型为float的数组，存放成绩。
        float[] scores=new float[5];
        //录入5个学生的成绩
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入5名参数者成绩：");
        for(int i=0;i<scores.length;i++){
            scores[i]=scanner.nextFloat();
        }
        float avg=competition.calAvg(scores);
        System.out.println("平均成绩："+avg);
        float max=competition.calMax(scores);
        System.out.println("最高成绩："+max);

    }
}
