package interface_inner_abstract;
public interface ISaveable  {
    String TAG = "ISaveable";
    private void print(String content) {
        System.out.println(content);
    }
    default void dataConvert() {
        print("dataConvert");
    }

    //跨Package依然可以使用，確定是public，前方+public也會反灰
    default boolean isExist() {
        print("isExist");
        return true;
    }

    boolean isOpen();
}
