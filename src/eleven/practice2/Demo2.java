package eleven.practice2;
/*

异常方法的声明语法形式：
修饰符 返回类型 方法名（参数列表）throws Exception{方法体}
* B方法调用A（一个已经对外声明有异常的方法）
* B必须处理这个异常，不然编译无法通过
* B处理有两种方式：
*   B用try-catch块捕获异常
*   B可以抛出这个异常,抛给jvm进行处理。异常信息暴露出来，编译是通过，但是运行没有通过。
*
*自定义一个异常，要求除数不是负数。

自定义异常只用去继承Exception，然后实现它的构造方法
* */
public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(3, 0));//如果这里不做处理，编译阶段都过不了，所以调用这个对外声明有异常的方法，我一定要处理他}
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) throws Exception{
//        System.out.println(divide(3,4));
//    }
    //定义一个静态方法实现除法,divide里面没有做异常处理，所以我用throws关键字对要调用我的对象或者方法进行声明，我这个代码有异常。
    public static int divide(int x,int y) throws Exception{
        return x/y;
    }
}
