package eleven.practice2;

public class Demo3 {
    public static void main(String[] args){
        try {
            divide(4, -2);
        }catch (DivideByMinusException e){
            System.out.println(e.toString());
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    /*定义一个除数不能为负数的方法，实现除法*/
    public static int divide(int x,int y) throws DivideByMinusException,ArithmeticException{
        if (y<0){
            throw new DivideByMinusException("除数不能为负数");
        }
        return x/y;
    }
}
