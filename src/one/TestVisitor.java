package one;

import java.util.Scanner;

public class TestVisitor {
    public static void main(String[] args){
        Visitor visitor=new Visitor();
        Scanner scanner=new Scanner(System.in);
        while (1==1) {
            System.out.print("请输入姓名:");
            String name = scanner.nextLine();
            if(name.equals("n")){
                System.out.println("退出程序");
                break;
            }
            System.out.print("请输入年龄:");
            int age = Integer.parseInt(scanner.nextLine());
            visitor.name = name;
            visitor.age = age;
            visitor.charge();
        }
    }
}
