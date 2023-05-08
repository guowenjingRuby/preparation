package one;

import java.util.Scanner;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/11 10:48
 */
public class Adminstrator {

    String name;
    String password;

    void changePassword(){
        //判断输入的用户名、密码是否正确，如果正确可以修改密码，
        if ((name.equals("admin1")) & (password.equals("111111"))){
            System.out.println();
            System.out.print("请输入新密码:");
            Scanner scanner=new Scanner(System.in);
            String newPassword=scanner.nextLine();
            password=newPassword;
            System.out.println("密码修改成功，新的密码为："+password);
        }else {
            System.out.print("用户名和密码不匹配，你没有权限更新管理员信息。");
        }

    }


}
