package third;

import java.util.Arrays;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 14:28
 */
public class CustomerBiz {

    String[] names = new String[30];
    Customer[] customers=new Customer[30];

    public void addName(String name) {
        //增加学生姓名
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }

    public void showNames() {
        System.out.println("********************************\n\n");
        System.out.println("           客户姓名列表            ");
        System.out.println("********************************");
        //显示全部学生姓名
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.print(names[i] + "   ");
            }
        }
        System.out.println();
    }

    public boolean modifyName(String oldName, String newName) {
        //定义一个变量，记录姓名是否修改成功，没有修改成功，后面通过是否触动修改动作，来确定修改这个变量
        boolean modify = false;
        //修改姓名之前要找到姓名，姓名存放在数组里面，去数组找，定位到每一个元素一一比较。遍历
        for(int i=0;i<names.length;i++){
            //判断旧的姓名是否存在数组中，通过比较进行。
            if(oldName.equals(names[i])){
                System.out.println("************修改结果*************");
                //找到了，给修改的动作
                names[i]=newName;
                //修改标志
                modify=true;
                System.out.println("找到并修改成功");
                showNames();
            }
        }
        return modify;
    }

    public void sortNames(String[] names){
        System.out.println("排序前：");
        //获取names中非空元素数量有几个
        int k=0;
        for(int j=0;j<names.length;j++){
            if(names[j]!=null) {
                k++;
                System.out.print(names[j]+"  ");
            }
        }
        System.out.println();
        //定义一个临时数组存放names中的非空数组个数
        String[] temp=new String[k];
        for(int j=0;j<temp.length;j++){
            temp[j]=names[j];
        }
        System.out.println("排序后：");
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+"  ");
        }
    }
    public void showCustomer(){
        System.out.println("客户信息：");
        for(int i=0;i<customers.length;i++) {
            if(customers[i]!=null) {
                customers[i].showInfo();
            }
        }
    }

    public void addCustomer(Customer customer){
        //找到存放学生数组中第一个为空的元素，将学生添加进去
        for(int i=0;i<customers.length;i++){
            if(customers[i]==null){
                customers[i]=customer;
                break;
            }
        }
    }

}
