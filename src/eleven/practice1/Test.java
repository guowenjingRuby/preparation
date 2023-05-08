package eleven.practice1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        定义一个ArrayList集合，里面都是存放动物类
    ArrayList<Animal> animalArrayList=new ArrayList<>();
//    定义一个ArrayList集合，里面都是存放猫类
        ArrayList<Cat> catArrayList=new ArrayList<>();
        //    定义一个ArrayList集合，里面都是存放小猫类
        ArrayList<MinCat> minCatArrayList=new ArrayList<>();

        //调用显示动物类的方法
        showAnimal(animalArrayList);
        showAnimal(catArrayList);
        showAnimal(minCatArrayList);

    }


   /*定义一个showAnimal方法，参数为匹配Cat类型或者Cat子类的一个Arraylist集合*/
//    public static void showAnimal(ArrayList<? extends Cat> list){
//        for (int i = 0; i < list.size(); i++) {
//            Cat cat = list.get(i);
//            System.out.println(cat);
//
//        }
//    }
   /*定义一个showAnimal方法，参数为匹配Cat类型或者Cat子类的一个Arraylist集合*/
   public static void showAnimal(ArrayList<? super MinCat> list){
       for (int i = 0; i < list.size(); i++) {
           Object cat = list.get(i);
           System.out.println(cat);

       }
   }
}
