package two;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 18:02
 */
public class ScoreBiz {
    String name;
    Float javaScore;
    Float cScore;

    public Float calcTotal(){
        return javaScore+cScore;
    }
    public Float calcAvg(){
        return calcTotal()/2;
    }
    void show(){
        System.out.println(name+"学生的java成绩为:"+javaScore+",C#的成绩为:"+cScore+",总分为:"+calcTotal()+",平均分为:"+calcAvg());

    }
}
