package third;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 13:21
 */
public class TestDumpling {
    public static void main(String[] args) {
        Dumpling dumpling=new Dumpling();
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入你吃什么口味的饺子：");
        String filling=scanner.nextLine();
        System.out.println(dumpling.doDumpling(filling));
    }
}
