package ten.practice2;

import eight.Dog;

public class Test {
    public static void main(String[] args) {
        Product product=new Product();
        //调用方法的时候才指定参数的类型
        product.printInfo("hello");
        product.printInfo(100);
        product.printInfo(new Dog("狗子","中华田园犬"));
    }
}
