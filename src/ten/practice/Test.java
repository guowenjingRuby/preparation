package ten.practice;

public class Test {
    public static void main(String[] args) {
        ChoiceProduct<String> stringChoiceProduct=new ChoiceProduct<>();
        //定义一个奖品数组
        String[] products={"华为手机","扫地机器人","苹果手机"};
        //奖品数组中的奖品存放到奖品池中
        for (int i = 0; i < products.length; i++) {
            stringChoiceProduct.setProduct(products[i]);
        }

        //抽取奖品
        String strProduct=stringChoiceProduct.getProduct();
        System.out.println("来试试你的手气，你抽中的是："+strProduct);

        System.out.println("======================");

        //奖品池中添加int类型现金
        int[] intProducts={10000,2000,10,1000,200};
        ChoiceProduct<Integer> integerChoiceProduct=new ChoiceProduct<>();
        for (int i = 0; i < intProducts.length; i++) {
            integerChoiceProduct.setProduct(intProducts[i]);
        }
//        抽取现金
        int moneyProduct=integerChoiceProduct.getProduct();
        System.out.println("来试试你的手气，你抽中的是："+moneyProduct);


        /*stringChoiceProduct和integerChoiceProduct数据类型一样吗?
        * 一样，泛型擦除？泛型仅存在编译阶段，到运行的时候jvm统一擦除类型，都当成ChoiceProduct来处理*/
        System.out.println(stringChoiceProduct.getClass());
        System.out.println(integerChoiceProduct.getClass());
        System.out.println(stringChoiceProduct.getClass()==integerChoiceProduct.getClass());

    }
}
