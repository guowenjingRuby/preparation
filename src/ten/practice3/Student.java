package ten.practice3;
/*类实现泛型接口
* 实现类本身不是泛型的话，我们需要在实现泛型接口的时候指定泛型的数据类型
*
* 实现类Student本身也是泛型，那我们就不需要在实现泛型接口的时候指定泛型的数据类型
*
* */
//public class Student implements Info<String>{
//    private String id;
//    @Override
//    public String printInfo() {
//        return null;
//    }
//}
public class Student<T> implements Info<T>{

    @Override
    public void printInfo(T t) {
        System.out.println(t);
    }
}