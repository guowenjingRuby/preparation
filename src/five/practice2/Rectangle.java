package five.practice2;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/20 14:50
 */
public class Rectangle extends Shape{
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    double area() {
        return this.x*this.y;
    }

    @Override
    double premeter() {
        return 2*(this.x+this.y);
    }
}
