package ten.practice2;

public class Product {
    String id;
    String name;
    /*定义一个泛型方法
    * 语法形式：访问权限 <泛型标识> 返回类型 方法名（泛型标识 参数名）
    */
    //假设定义一个打印的泛型方法。
     <E> void printInfo(E t){
         System.out.println(t);
     }

}
