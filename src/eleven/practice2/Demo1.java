package eleven.practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        try {
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
//        }catch (Exception e){
//            System.out.println("万能大法，可以捕获所有异常，异常信息为："+e.toString());
//        }
        }catch (ArithmeticException e){
            System.out.println("异常成功捕获，异常信息为："+e.getMessage());
        }catch(InputMismatchException e) {
            System.out.println("成功捕获InputMismatchException,异常信息为：" + e.getMessage());
        }catch(Exception e){
            System.out.println("万能大法");
        }
        finally {
            System.out.println("感谢使用本程序！");
        }


    }
}
