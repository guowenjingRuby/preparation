package eleven.practice2;
/*自定义一个异常，要求除数不是负数。
自定义异常只用去继承Exception，然后实现它的构造方法
 * */
public class DivideByMinusException extends Exception{
    /*异常的无参构造方法，方法体内调用父类的无参的构造方法*/
//    public DivideByMinusException(){
//        super();
//    }
    /*重载构造方法，实现异常信息的输出，方法体内调用父类有参的构造方法实现异常信息的输出*/
    public DivideByMinusException(String message){
        super(message);
    }

}
