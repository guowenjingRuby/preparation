package one;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 17:02
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入正方形的长:");
        Float longc = Float.parseFloat(scanner.nextLine());
        System.out.print("请输入正方形的宽:");
        Float wide = Float.parseFloat(scanner.nextLine());
        rectangle.longc = longc;
        rectangle.wide = wide;
        rectangle.area();
        rectangle.circumference();
    }
}
