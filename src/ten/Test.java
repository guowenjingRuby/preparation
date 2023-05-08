package ten;

import eight.Dog;

public class Test {
    public static void main(String[] args) {
        //创建对象的时候才指定T的类型，T指定为String
        Generic<String> stringGeneric=new Generic<String>("abc");
        String key = stringGeneric.getKey();
        System.out.println(key);
        System.out.println("====================================");
        //想要类去操作int,T指定为int
        Generic<Integer> integerGeneric=new Generic<>(100);
        Integer intkey = integerGeneric.getKey();
        System.out.println(intkey);
//       操作狗对象

        Generic<Dog> dogGeneric=new Generic<>(new Dog("狗子","中华田园犬"));
        Dog dogKey = dogGeneric.getKey();
        System.out.println(dogKey);



    }
}
