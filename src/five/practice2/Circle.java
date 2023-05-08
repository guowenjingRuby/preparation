package five.practice2;

import five.practice2.Shape;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 13:32
 */
public class Circle extends Shape {
    private double r;

    private final double PI=3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return PI*Math.pow(r,2);
    }

    @Override
    double premeter() {
        return 2*PI*this.r;
    }
}
