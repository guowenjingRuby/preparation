package twelve;

import java.util.Random;

/*
* Random.无参的构造方法，随机生成随机数
*         有参的构造方法，作用：让每次运行生成的随机数都一样
* */
public class Demo4 {
    public static void main(String[] args) {
/*        Random random=new Random();
        //调用方法，生成10个100之内的随机数
        for (int i = 0; i < 10; i++) {
            int number=random.nextInt(100);
            System.out.println(number);
        }*/

        Random random=new Random(20);
        //调用方法，生成10个100之内的随机数
        for (int i = 0; i < 10; i++) {
//            int number=random.nextInt(100);//生成0-n之间的随机数
            float number=random.nextFloat();
            Double number1=random.nextDouble();
            int number2 = random.nextInt();
            System.out.println(number2);
        }
    }
}
