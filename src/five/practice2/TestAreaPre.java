package five.practice2;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 13:35
 */
public class TestAreaPre {
    public static void main(String[] args) {
        Circle circle=new Circle(30);
        System.out.println(circle.premeter());
        System.out.println(circle.area());

        Rriangle rectangle=new Rriangle(1,1,2);
        System.out.println(rectangle.premeter());
        System.out.println(rectangle.area());
    }
}
