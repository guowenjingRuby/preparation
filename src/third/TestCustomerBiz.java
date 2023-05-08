package third;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 14:43
 */
public class TestCustomerBiz {
    public static void main(String[] args) {
        CustomerBiz customerBiz = new CustomerBiz();
        //定义一个数组，存放输入的学生姓名。
        String[] names = new String[30];
        Scanner scanner = new Scanner(System.in);
//        //调用添加
//        int i = 0;
//        while (1 == 1) {
//            System.out.print("请输入顾客姓名：");
//            String name = scanner.nextLine();
//            customerBiz.addName(name);
//            names[i] = name;
//            i++;
//            System.out.print("继续输入吗（y/n）：");
//            String y_n = scanner.nextLine();
//            if (y_n.equals("n")) {
//                break;
//            }
//        }


//        //调用显示姓名方法
//        customerBiz.showNames();
//        //调用修改姓名方法
//        System.out.print("请输入要修改的客户姓名：");
//        String oldName=scanner.nextLine();
//        System.out.print("请输入新的客户姓名：");
//        String newName=scanner.nextLine();
//        customerBiz.modifyName(oldName,newName);

        //调用姓名排序方法
//        customerBiz.sortNames(names);
        //添加客户信息
        while (1 == 1) {
            //根据Customer类创建Customer对象，输入姓名、年龄、是否是会员。
            Customer customer = new Customer();
            System.out.print("请输入顾客姓名：");
            String name = scanner.nextLine();
            //将输入的姓名赋值给customer的姓名
            customer.name = name;
            if (name.equals("q")) {
                break;
            }

            System.out.print("请输入顾客年龄：");
            int age = Integer.parseInt(scanner.nextLine());
            //将输入的年龄赋值给student的年龄
            customer.age = age;

            System.out.print("请输入顾客是否是vip：");
            Boolean vip = Boolean.valueOf(scanner.nextLine());
            //将输入的分数赋值给student的分数
            customer.isVip = vip;


            //添加顾客
            customerBiz.addCustomer(customer);

        }
        customerBiz.showCustomer();

    }
}
