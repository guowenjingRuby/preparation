package two;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 18:11
 */
public class TestScoreBiz {
    public static void main(String[] args) {
        ScoreBiz scoreBiz=new ScoreBiz();
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name=scanner.nextLine();
        System.out.print("请输入java成绩：");
        float javaScore=Float.parseFloat(scanner.nextLine());
        System.out.print("请输入C#成绩：");
        float cScore=Float.parseFloat(scanner.nextLine());
        scoreBiz.javaScore=javaScore;
        scoreBiz.cScore=cScore;
        scoreBiz.name=name;
        scoreBiz.show();

    }
}
