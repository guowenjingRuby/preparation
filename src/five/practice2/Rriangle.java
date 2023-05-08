package five.practice2;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 13:28
 */
public class Rriangle extends Shape {
    private double a;

    private double b;

    private double c;

    public Rriangle(double a, double b, double c) {
        if((a+b)>c && (a+c)>b &&(b+c)>a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else{
            System.out.println("构不成三角形");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    double area() {
        double p=premeter();
        return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double premeter() {
        return this.a+this.b+this.c;
    }
}
