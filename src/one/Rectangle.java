package one;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/15 10:29
 */
public class Rectangle {
    float longc;
    float wide;

    void area() {
        System.out.println("长方形的面积为："+ longc * wide);

    }
    void circumference(){
        System.out.println("长方形的周长为："+2 * (longc + wide));
    }
}
