package five.practice7;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 11:09
 */
public class PostGraduate extends Student{
    String guide;
    public PostGraduate(){
        //super();//有没有该语句，效果都一样
        System.out.println("execute PostGraduate()");
    }

    public PostGraduate(String name,String school,String guide){
        super(name,school);
        this.guide=guide;
        System.out.println("execute PostGraduate(name,school,guide)");
    }
}
