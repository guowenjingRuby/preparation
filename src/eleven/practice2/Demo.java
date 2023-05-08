package eleven.practice2;

import java.util.Scanner;
/*
* try{
*   可能出现异常的代码
* }catch (第六行代码块可能出现的异常类 e){
*   发生异常时要执行的内容
* }finally{
*   无论是否发生异常，我都必须执行
* }
* try-catch块是必须要有得，同时catch块可以多个。
* finally分支是可带可不带
* 当发生异常的时候，可能出现异常的代码后面部分的代码都不执行了，调到catch分支里面去执行。
*
* Throwable类常用的三个方法
* String getMessage() 返回异常的消息字符串
* String toString() 返回异常的简单信息描述
* void printStackTrace() 获取异常类名和异常信息，以及异常显现在程序中的位置，把信息输出在控制台
*
*
*
*
*
* */


public class Demo {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
        //判断输入的内容是否是”abc“
        String str = "abc";
        try {
            if (str.equals("abc")) {
                System.out.println("是");
            }else{
                System.out.println("否");
            }
        }catch (Exception e){
            System.out.println("str.equals(\"abc\")发生了异常，直接跳转到catch分支执行，str.equals(\"abc\")后面的try分支里面的代码就不在执行");
            System.out.println("发生了异常，具体异常信息为："+e.getMessage());
//            System.out.println("发生了异常，具体异常信息为："+e.toString());
//            e.printStackTrace();
        }finally {
            System.out.println("无论str.equals(\"abc\")是否有异常，你都能看到这句话");
        }
//        if (str.equals("abc")) {
//                System.out.println("是");
//            }
    }
}
