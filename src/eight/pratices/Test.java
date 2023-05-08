package eight.pratices;


import java.util.*;

public class Test {
    static Collection<Phone> c = new ArrayList<>();

    public static void main(String[] args) {
        c.add(new Phone("小米9", "玫瑰金", 3999.00, 15));
        c.add(new Phone("小米9", "幻彩紫", 3699, 28));
        c.add(new Phone("华为P30", "白金色", 5699, 2));
        c.add(new Phone("VIVO PLus9", "幻彩紫", 2699, 28));
        c.add(new Phone("魅族 16th", "紫金黑", 5229, 10));
        c.add(new Phone("苹果 11", "土豪金", 8999, 51));
        while (1 == 1) {
            System.out.println("欢迎使用库房管理系统,请选择要进行的操作");
            System.out.println("1. 商品入库");
            System.out.println("2. 商品显示");
            System.out.println("3. 删除商品");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if (s == 1) {
                addWarehouse();
                System.out.println("商品入库成功，入库后仓库商品如下：");
                warehouse();
            } else if (s == 2) {
                warehouse();

            } else if (s == 3) {
                System.out.println("请输入你要删除的商品编号：");
                int index = sc.nextInt();
                delwarehouse(index);
                System.out.println("商品出库成功，出库后仓库商品如下：");
                warehouse();
            }

        }
    }

    private static void delwarehouse(int index) {
        ((ArrayList)c).remove(index);
    }

    private static void warehouse() {
        //获取迭代器
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Phone s = (Phone) it.next();
            System.out.printf("%s...%s...%s...%s\n", s.getName(), s.getColor(), s.getPrice(), s.getNum());
        }
    }

    private static void addWarehouse() {
        while (true) {
            System.out.println("您是否录入商品？");
            Scanner w = new Scanner(System.in);
            String s = w.next();
            if (!s.equals("no")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("请输入商品的名称：");
                String name = sc1.next();
                System.out.println("请输入商品的颜色：");
                String color = sc1.next();
                System.out.println("请输入商品的价格：");
                int p = sc1.nextInt();
                System.out.println("请输入商品的数量：");
                int n = sc1.nextInt();
                c.add(new Phone(name, color, p, n));
                break;
            } else {
                break;
            }
        }
    }
}
