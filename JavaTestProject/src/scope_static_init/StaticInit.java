package scope_static_init;

public class StaticInit {
    private static int data;

    /*
      靜態初始化，不管放哪都會比instance init還要早
      但static之間上下，會影響誰先處理
      */
    static {
        data = 2;
        System.out.println("static1 init");
    }

    public StaticInit() {
        System.out.println("init");
    }

    static {
        System.out.println("static2 init");
    }

    void print() {
        System.out.println(StaticInit.data);
    }

}
