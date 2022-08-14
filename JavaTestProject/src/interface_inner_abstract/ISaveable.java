package interface_inner_abstract;
public interface ISaveable  {
    String TAG = "ISaveable";
    private void print(String content) {
        System.out.println(content);
    }
    default void dataConvert() {
        print("dataConvert");
    }

    default boolean isExist() {
        print("isExist");
        return true;
    }

    boolean isOpen();
}
