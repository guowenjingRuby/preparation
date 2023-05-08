package one;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/15 11:02
 */
public class Calculator {
    float num1;
    float num2;
    String  syboml;
    /*
     * @description:加法
     * @author: guowenjing
     * @date:  11:03
     * @param:
     * @return:
     **/
//    float add(float num1,float num2){
//        return num1+num2;
//    }
//    /*
//     * @description:减法
//     * @author: guowenjing
//     * @date:  11:05
//     * @param:
//     * @return:
//     **/
//    float subtrcation(float num1,float num2){
//        return num1-num2;
//    }
//
//    float multi(float num1,float num2){
//        return num1*num2;
//    }
//
//    float division(float num1,float num2){
//        return num1*num2;
//    }
//
//    double calcul(String symbol,float num1,float num2){
//        if (symbol.equals("-")){
//            return subtrcation(num1,num2);
//        } else if (symbol.equals("+")) {
//            return add(num1,num2);
//
//        } else if (symbol.equals("*")) {
//            return multi(num1,num2);
//
//        }else{
//            return division(num1,num2);
//        }
//    }

    void calcul(){
        if(syboml.equals("+")) {
            System.out.println("计算结果为："+(num1+num2));
        }
        if(syboml.equals("-")) {
            System.out.println("计算结果为："+(num1-num2));
        }
        if(syboml.equals("*")) {
            System.out.println("计算结果为："+(num1*num2));
        }
        if(syboml.equals("/")) {
            System.out.println("计算结果为："+(num1/num2));
        }
    }
}
