package one;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 16:44
 */
public class Visitor {
    String name;
    int age;

    void charge(){
        if(18<age&age<60){
            System.out.println(name+"的年龄为："+age+",门票价格为：20元\n");
        }else{
            System.out.println(name+"的年龄为："+age+",门票免费\n");
        }
    }

}
