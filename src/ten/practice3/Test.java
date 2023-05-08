package ten.practice3;

import eight.Dog;

public class Test {
    public static void main(String[] args) {
        Student<String> stringStudent=new Student<>();
        stringStudent.printInfo("hello");
        stringStudent.printInfo("Java");

        System.out.println("===============================");
        Student<Integer> integerStudent=new Student<>();
        integerStudent.printInfo(10000);
        integerStudent.printInfo(100000);

        System.out.println("===============================");
        Student student=new Student();
        student.printInfo("hello world");
        student.printInfo(10000);
        student.printInfo(new Dog("狗子","中华田园犬"));

    }
}
