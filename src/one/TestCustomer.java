package one;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 16:40
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入积分:");
        Float score=Float.parseFloat(scanner.nextLine());
        System.out.print("请输入卡类型:");
        String cardKind=scanner.nextLine();
        customer.score=score;
        customer.cardKind=cardKind;
        customer.show();
    }
}
