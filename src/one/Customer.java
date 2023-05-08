package one;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/15 12:58
 */
public class Customer {
    /**
     * 积分
     */
    float score;
    /**
     * 卡类型
     */
    String cardKind;

    /**
     * @description:显示积分和卡类型
     * @author: guowenjing
     * @date: 13:00
     * @param: []
     * @return: void
     **/
    void show() {
        if ((cardKind.equals("金卡") & score >= 1000) || (cardKind.equals("普卡") & score >= 5000)) {
            System.out.println("您的积分为：" + score + ",您的卡类型为:" + cardKind);
            System.out.println("回馈积分500分");
        }else{
            System.out.println("不满足积分回馈条件");
        }

    }


}
