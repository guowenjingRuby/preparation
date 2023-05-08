package one;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 16:57
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入半径:");
        Float r = Float.parseFloat(scanner.nextLine());
        circle.radius=r;
        circle.area();
    }
}
