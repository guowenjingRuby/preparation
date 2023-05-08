package five.practice7;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 11:04
 */
public class Person {

    String name;

    public Person(){
        //super();//有没有该语句，效果都一样
        System.out.println("execute Person()");
    }

    public Person(String name){
        this.name=name;
        System.out.println("execute Person(name)");
    }
}
