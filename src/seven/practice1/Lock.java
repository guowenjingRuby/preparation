package seven.practice1;
/*所有的接口默认是抽象的，加不加abstract是一样的。
* 接口中所有的方法也是默认是抽象的，加不加abstract是一样的。
* */
public interface Lock {
    void upLock();
    void closeLock();
}
