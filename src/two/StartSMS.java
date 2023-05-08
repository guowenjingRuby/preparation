package two;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/26 16:59
 */
public class StartSMS {
    Scanner scanner = new Scanner(in);
    void showLoginMenu() {
        out.println("        欢迎使用我行我素购物管理系统\n");
        out.println("                  1.登录系统\n");
        out.println("                  2.退出\n");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * * \n");
        System.out.print("请选择，输入数字：");
        String str1 = scanner.nextLine();
        if (str1.equals("1")) {
            out.print("请输入用户名：");
            String str7=scanner.nextLine();
            if(str7.equals("admin")){
                out.print("请输入密码：");
                String str8=scanner.nextLine();
                if(str8.equals("123456")){
                    showMainMeun();
                }
            }
        } else {
            System.exit(0);
        }
    }

    void showMainMeun() {
        out.println("        我行我素购物管理系统\n");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * * \n");
        out.println("                  1.客户信息管理\n");
        out.println("                  2.真情回馈\n");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * * \n");
        System.out.print("请选择，输入数字或按0返回上级菜单：");
        String str2 = scanner.nextLine();
        if (str2.equals("0")) {
            showLoginMenu();
        } else if (str2.equals("1")) {
            showCustMenu();
        } else if (str2.equals("2")) {
            showSendMenu();
        } else {
            out.println("请重新输入。");
        }
    }

    void showSendMenu() {
        out.println("        我行我素购物管理系统>真情回馈");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * * \n");
        out.println("                  1.幸运大放送\n");
        out.println("                  2.幸运抽奖\n");
        out.println("                  3.生日问候\n");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * * \n");
        System.out.print("请选择，输入数字或按0返回上级菜单：");
        Scanner scanner = new Scanner(in);
        String str3=scanner.nextLine();
        if (str3.equals("1")) {
            System.out.println("执行幸运大放送");
        } else if (str3.equals("2")) {
            System.out.println("执行幸运抽奖");
        } else if (str3.equals("3")) {
            System.out.println("执行生日问候");
        } else if (str3.equals("0")) {
            showMainMeun();
        }
    }

    void showCustMenu() {
        out.println("        我行我素购物管理系统>客户信息管理");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * *  \n");
        out.println("                  1.客户信息查询\n");
        out.println("                  2.客户信息添加\n");
        out.println("                  3.客户信息修改\n");
        out.println("                  3.客户信息删除\n");
        out.println("* * * * * * * * * * * * * * * * * * * * * * * * * \n");
        System.out.print("请选择，输入数字或按0返回上级菜单：");
        Scanner scanner = new Scanner(in);
        String str4=scanner.nextLine();
        if (str4.equals("1")) {
            System.out.println("客户信息查询");
        } else if (str4.equals("2")) {
            System.out.println("客户信息添加");
        } else if (str4.equals("3")) {
            System.out.println("客户信息修改");
        } else if (str4.equals("4")) {
            System.out.println("客户信息删除");
        } else if (str4.equals("0")) {
            showMainMeun();
        }
    }
}
