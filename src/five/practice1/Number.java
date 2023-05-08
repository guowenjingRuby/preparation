package five.practice1;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/17 14:11
 */
public class Number {
    private int num1;
    private int num2;

    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    double add(){
        return this.num1+this.num2;
    }

    double subtrcation(){
        return this.num1-this.num2;
    }

    double multi(){
        return this.num1*this.num2;
    }

    double division(){
        return this.num1/this.num2;
    }

}
