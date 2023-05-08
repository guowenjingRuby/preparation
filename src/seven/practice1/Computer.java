package seven.practice1;

public class Computer implements Lock{
    @Override
    public void upLock() {
        System.out.println("手指放上去，指纹识别成功就开锁了");
    }

    @Override
    public void closeLock() {
        System.out.println("30分钟不用自动上锁");
    }
}
