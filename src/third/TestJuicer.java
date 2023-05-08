package third;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 13:01
 */
public class TestJuicer {
    public static void main(String[] args) {
        Juicer juicer=new Juicer();
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入你想要什么口味的果汁：");
        String fruit1=scanner.nextLine();
        System.out.println(juicer.doJuicer(fruit1));
    }
}
