package seven;

public class Test {
    public static void main(String[] args) {
        /*接口的接口的匿名实现类的对象*/
        CPU cpu=new CPU() {
            @Override
            public String getBrand() {
                return "Inter";
            }

            @Override
            public String getFre() {
                return "3.84";
            }
        };
        EMS ems=new EMS() {
            @Override
            public int getMe() {
                return 64;
            }
        };

        HardDis disk=new HardDis() {
            @Override
            public int getStore() {
                return 3000;
            }
        };
        Computer computer=new Computer(ems, disk, cpu);
        computer.printInfo();
    }
}
