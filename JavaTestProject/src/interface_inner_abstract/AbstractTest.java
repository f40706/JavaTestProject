package interface_inner_abstract;

public abstract class AbstractTest {
    //內部變數
    private final int age;
    //初始化
    public AbstractTest(int age) {
        this.age = age;
    }
    //預設是package，可以改變private
    private void print() {
        System.out.println();
    }
    //預設是package，可以改變public
    public int getAge() {
        return age;
    }
    //abstract不可在此實作，必須override
    abstract boolean canFly();
}
