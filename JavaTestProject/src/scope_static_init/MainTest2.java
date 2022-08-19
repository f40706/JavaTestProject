package scope_static_init;

import generics.APlayer;
import generics.BPlayer;
import generics.CPlayer;
import interface_inner_abstract.ISaveable;

public class MainTest2 {
    /**
     * testScope: 實現作用域的測試
     * testStaticInit: 實現靜態初始化的測試
     */
    public static void main(String[] args) {
//        testScope();
        testStaticInit();
        ISaveable iSaveable = new ISaveable() {
            @Override
            public boolean isOpen() {
                return false;
            }

            @Override
            public boolean isExist() {
                return ISaveable.super.isExist();
            }
        };
    }

    private static void testStaticInit() {
        StaticInit staticInit = new StaticInit();
        staticInit.print();
    }

    private static void testScope() {
        //default，printLevel不同package不能使用
        APlayer aPlayer = new APlayer("12", 20);
//        aPlayer.printLevel();

        //protected，僅允許CPlayer內部使用，繼承僅提供給子使用
        CPlayer cPlayer = new CPlayer("21", 20);
//        cPlayer.scopeTest();

        //public，全部範圍皆允許
        BPlayer bPlayer = new BPlayer("43", 20);
        System.out.println(bPlayer.getScore());
    }
}
