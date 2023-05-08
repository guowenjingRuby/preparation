package ten;
/*泛型的占位符：T E V K
* 不指定Generic类要操作的数据类型，留到调用的时候指定。
*
* */
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
