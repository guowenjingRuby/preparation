package twelve;

import java.util.ArrayList;

/*Math
* 1.判断某个数是否是素数：只能被1和本身除的数的素数。 2,3,5,7,8  除法号前面的叫被除数，后面的除数。对于7而言，除了1和7以为没有其他的除数了
* 7=1*7 对于number而言：要找2-number之间能不能有数被number整除。能找到证明不是素数，找不到就是的
* 8=1*8
* 8=2*4
* 经过分析：循环可以缩小，非素数两个因子，一个大于根号number，一个小于根号number
* 2.水仙花数（三位数）：个位**3+十位**3+百位**3=百位十位个位。。。153=1**3+5**3+3**3
* Math.pow(个位,3)=========个位**3
* */
public class Demo3 {
    public static void main(String[] args) {
        int number=16349;
        Boolean bool=isPrime(number);
        System.out.println(bool);

        /*判断100-1000之间有多少水仙花数*/
        ArrayList<Integer> arrayList=new ArrayList<>();
        /*循环往arrayList中添加100-1000之间的数，通过循环来添加*/
        for (int i = 100; i <1000; i++) {
            arrayList.add(i);

        }
        int count=daffodil(arrayList);
        System.out.println("水仙花的个数是："+count);
    }

    /*判断集合中有多少个水仙花数*/
    private static int daffodil(ArrayList<Integer> arrayList) {
        return 4;
    }
    /*判断一个数是否是素数*/
    private static boolean isPrime(int number) {

        //定义一个变量，标志是否素数，假设每个数都是素数
        boolean flag=true;
        int count=0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count+=1;
            if (number%i==0){
                //证明2到number-1之间有数被number整除，所以就不是素数
                flag=false;
            }
        }
        System.out.println("循环执行的次数："+count);
        //判断flag有没有被修改
        if (flag){
            return true;
        }else {
            return false;
        }
    }
}
