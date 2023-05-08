package ten.practice;

import java.util.ArrayList;
import java.util.Random;

/*模拟公司年会抽奖*/
public class ChoiceProduct<T> {
    Random random=new Random();
//    奖品
    private T product;

//    定义一个集合存放奖品,成为奖品池
    ArrayList<T> products=new ArrayList<>();

//    往奖品池中添加奖品的方法
    void setProduct(T t){
        products.add(t);
    }

    //定义一个从奖品池中随机抽取一个奖品的方法,这个属于泛型类的成员方法。
    T getProduct(){
        int number=random.nextInt(products.size());
//        获取集合中的一个元素
        T product=products.get(number);
        return product;
    }



}
