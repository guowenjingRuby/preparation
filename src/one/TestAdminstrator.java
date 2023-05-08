package one; /**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/15 10:49
 */
import java.util.Scanner;
public class TestAdminstrator {
    public static void main(String[] args) {
        //实例化admin对象
        Adminstrator admin=new Adminstrator();
        //创建Scanner对象，接收用户终端的输入的用户名和密码
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入用户名:");
        //用户名
        String name=scanner.nextLine();
        System.out.print("请输入密码:");
        //密码
        String password=scanner.nextLine();
        //给对象姓名、密码属性赋终端输入的用户名、密码
        admin.name=name;
        admin.password=password;
//        System.out.println();
        //调用对象的修改密码的方法
        admin.changePassword();

    }
}