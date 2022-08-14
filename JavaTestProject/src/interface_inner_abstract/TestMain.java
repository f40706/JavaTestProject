package interface_inner_abstract;

public class TestMain extends AbstractTest {
    public TestMain() {
        //重寫AbstractTest繼承
        super(21);
    }

    /**
     * interfaceTest: 實現Interface的各種用法
     * innerTest: 實現Inner的用法及應注意的事情
     * AbstractTest: 實現Abstract用法
     * */
    public static void main(String[] args) {
//        interfaceTest();
        innerTest();
    }

    private static void innerTest() {
        InnerTest innerTest = new InnerTest('s', 20);
        System.out.println(innerTest.getContent());

        //此處注意Data宣告成static才能夠這樣初始化
        //沒宣告成static，也有可能造成記憶體洩漏，應注意，Tool也會提醒加上static
        InnerTest.Data data = new InnerTest.Data('c', 22);
        System.out.println("TestMain " + data.getWord() + " : " + data.getCount());
        InnerTest.Data data2 = new InnerTest.Data('h', 19);
        System.out.println("TestMain " + data2.getWord() + " : " + data2.getCount());

        //此處Inner雖然InnerTest.Data是靜態，但不會共享記憶體
        System.out.println(innerTest.getContent());
    }

    private static void interfaceTest() {
        //interface內部的變數是static final型態，不可改變
        System.out.println("tag: " + ISaveable.TAG);
        //內部可撰寫，可super，以及內部可使用private，參考內部print
        iSaveable.dataConvert();
        System.out.println(iSaveable.isExist());
        //內部不可撰寫，不可super
        iSaveable.isOpen();
    }

    private static final ISaveable iSaveable = new ISaveable() {

        @Override
        public void dataConvert() {
            ISaveable.super.dataConvert();
        }

        @Override
        public boolean isExist() {
            return ISaveable.super.isExist();
        }

        @Override
        public boolean isOpen() {
            return true;
        }
    };

    @Override
    boolean canFly() {
        return false;
    }
}
