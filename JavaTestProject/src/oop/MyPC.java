package oop;

public class MyPC extends PC {
    private int money = 20000;
    public MyPC(String name, Monitor monitor) {
        super(name, monitor);
    }

    public int getMoney() {
        if(monitor.getWidth() <= 1920) {
            money = (int) (money*0.8);
        }
        return money;
    }
}
